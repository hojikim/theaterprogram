package com.itwill.view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.controllerp.InfoDao;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class search extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textSearch;
    private JButton btnNewButton;
    // 비밀번호의 colum을 호출안하는 이유 - 회원들이 보는 정보 이기에 
    // 비밀번호가 호출되어 있으면 아무나 예매취소를 진행할수 있다
    public static final String [] infos = {"이름","전화번호","이메일","시간","좌석번호","결제금액"};
    private DefaultTableModel tableModel;
    private JTable table;
    private Component parent;
    private InfoDao dao = InfoDao.getInstance();
    private JTextField textPassword;
    private JButton btnCancel;
    
    /**
     * Launch the application.
     */
    public static void SearchPerson(Component parent) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    search frame = new search(parent);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public search(Component parent){
        this.parent = parent;
        initiliaze();
    }
    /**
     * Create the frame.
     */
    public void initiliaze() {
        setTitle("조회");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int x =100;
        int y =100;
        if (parent != null) {
            x = parent.getX() + parent.getWidth();
            y = parent.getY();
        }
        setBounds(x, y, 603, 424);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 64, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblInformation = new JLabel("에약자 성함, 전화번호, 이메일 중에 입력하세요");
        lblInformation.setForeground(new Color(255, 255, 255));
        lblInformation.setFont(new Font("굴림", Font.PLAIN, 10));
        lblInformation.setBounds(151, 64, 265, 30);
        contentPane.add(lblInformation);
        
        textSearch = new JTextField();
        textSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textSearch.setBounds(58, 22, 344, 42);
        contentPane.add(textSearch);
        textSearch.setColumns(10);
        
        btnNewButton = new JButton("검색");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 검색 버튼클릭시 작동하는 메서드
                searchperson();
            }
        });
        btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnNewButton.setBounds(414, 22, 97, 37);
        contentPane.add(btnNewButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(23, 104, 541, 206);
        contentPane.add(scrollPane);
        
        table = new JTable();
        tableModel=new DefaultTableModel(null,infos);
        table.setModel(tableModel);
        scrollPane.setViewportView(table);
        
        btnCancel = new JButton("예매취소");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 예매취소 버튼 클릭시 작동하는 메서드
                correct();
          
            }
        });
        btnCancel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnCancel.setBounds(352, 320, 145, 42);
        contentPane.add(btnCancel);
        
        textPassword = new JPasswordField();
        textPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textPassword.setBounds(104, 325, 220, 37);
        contentPane.add(textPassword);
        textPassword.setColumns(10);
        

    }
        
    //  예매취소 버튼 클릭시 작동하는 메서드
    private void correct() {
        // dao의 search 메서드에서 
        // 검색란에 입력하는 텍스트를 모두 받아온다 (이름, 전화번호, 이메일)
        // search메서드 - 이름, 전화번호, 이메일 중 해당하는 정보가 있을시 정보를 가져온다
        Info info= dao.search(textSearch.getText(), textSearch.getText(), textSearch.getText());
        
        // 새로운 ArrayList a에 해당되어 가져온 정보를 추가한다
        ArrayList<Info> a = new ArrayList<Info>();
        a.add(info);
        
        // table에 호출하기 위해
        // table은 Object를 허용하기 때문에 
        // Object로 변경해준다
        tableModel=new DefaultTableModel(null,infos);
        for (Info b : a) {
            Object [] row = {
            b.getName(),
            b.getPhone(),
            b.getEmail(),
            b.getTime(),
            b.getSeat(),
            b.getMoney()
            };
            
            // 변경된 정보의 패스워드가 지금 입력한 패스워드와 같다면
            // 그 행을 삭제시킨다
            if (textPassword.getText().equals(b.getPassword())){
                int deleterow = table.getSelectedRow();
                if (deleterow == -1) { // 선택된 행이 없는 경우
                    JOptionPane.showMessageDialog(this, 
                            "정보란을 다시 선택하세요.");
                    
                    return;
                }
                dao.delete(textPassword.getText());
                
                JOptionPane.showMessageDialog(this, "예매 취소 되었습니다", "예매 취소", JOptionPane.CLOSED_OPTION);
                textSearch.setText("");
                textPassword.setText("");
                
                
                // 삭제 시킨뒤 보여지는 테이블이 없어진 상태여야 하기때문에 set 해준다
                table.setModel(tableModel);
            }
                }
       
            
        }
    
    // 검색버튼 클릭시 작동하는 메서드
    private void searchperson() {
        //검색란에서 가져온 문자열이 아무것도 없거나 공란일시 오류
        String something = textSearch.getText();
        
        if(something == null || something.equals("")) {
            JOptionPane.showMessageDialog(this, "다시 입력해주세요", "오류",JOptionPane.ERROR_MESSAGE);
            
            textSearch.requestFocus();
            return;
            
        }
        
        // dao의 search 메서드에서 
        // 검색란에 입력하는 텍스트를 모두 받아온다 (이름, 전화번호, 이메일)
        // search메서드 - 이름, 전화번호, 이메일 중 해당하는 정보가 있을시 정보를 가져온다
        Info info= dao.search(textSearch.getText(), textSearch.getText(), textSearch.getText());
        ArrayList<Info> a = new ArrayList<Info>();
        a.add(info);
        
        // table에 호출하기 위해
        // table은 Object를 허용하기 때문에 
        // Object로 변경해준다
        tableModel=new DefaultTableModel(null,infos);
        for (Info b : a) {
            Object [] row = {
            b.getName(),
            b.getPhone(),
            b.getEmail(),
            b.getTime(),
            b.getSeat(),
            b.getMoney()
            };
            // Object로 변경된 리스트를 table줄에 추가
            tableModel.addRow(row);
        }
        table.setModel(tableModel);
    }
}
