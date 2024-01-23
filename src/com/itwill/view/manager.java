package com.itwill.view;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.controllerp.InfoDao;
import com.itwill.view.Info;
import javax.swing.JButton;
import java.awt.Color;



public class manager extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Component parent;
    private JScrollPane scrollPane;
    private JTable table;
    private DefaultTableModel tableModel;
    public static final String [] infoes = {"이름","전화번호", "이메일","시간","좌석","결제금액","비밀번호"};
    private InfoDao dao =InfoDao.getInstance();
    /**
     * Launch the application.
     */
    public static void mangerMode(Component parent) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    manager frame = new manager(parent);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public manager(Component parent) {
        setForeground(new Color(255, 255, 255));
        this.parent = parent;
   
        initialize();
        // table에서 일어나는 메서드
        initTable();
    }
    
    /**
     * Create the frame.
     */
    public void initialize() {
        setTitle("관리자");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int x =100;
        int y =100;
        if(parent != null) {
            x= parent.getX() + parent.getWidth();
            y= parent.getY();
        }
        setBounds(x, y, 811, 661);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 64));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 10, 771, 589);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setBackground(new Color(62, 130, 121));
        tableModel=new DefaultTableModel(null,infoes);
        scrollPane.setViewportView(table);
       
        
        

    }
    
    // table에서 일어나는 메서드 
    private void initTable() {
        // dao의 read메서드를 통해 db의 모든 정보를 호출한다 
         ArrayList<Info>a=dao.read(); 
    
        tableModel = new DefaultTableModel(null, infoes); //테이블 모델 리셋(초기화)
        for (Info b : a) { //DB에서 검색한 내용으로 테이블의 행들을 만듦.
            Object[] row = {
                    b.getName(),
                    b.getPhone(),
                    b.getEmail(),
                    b.getTime(),
                    b.getSeat(),
                    b.getMoney(),
                    b.getPassword()
            };
            tableModel.addRow(row);
        }
        table.setModel(tableModel); //테이블에 모델을 다시 세팅
    }
    
    
}
