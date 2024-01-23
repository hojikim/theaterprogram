package com.itwill.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.IntBuffer;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.itwill.controllerp.InfoDao;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class s {

    private JFrame frame;
    private JLabel lblAbult;
    private JRadioButton rdbtnAbult1;
    private JPanel panel;
    private JRadioButton rdbtnAbult2;
    private JRadioButton rdbtnAbult3;
    private JRadioButton rdbtnAbult4;
    private JLabel lblChild;
    private JRadioButton rdbtnChild1;
    private JRadioButton rdbtnChild2;
    private JRadioButton rdbtnChild3;
    private JRadioButton rdbtnChild4;
    private JLabel lblPSelect;
    private JLabel lblTSelect;
    private JLabel lblInfo;
    private JTextField textName;
    private JLabel lblName;
    private JLabel lblPhone;
    private JTextField textPhone;
    private JLabel lblEmail;
    private JTextField textEmail;
    private JButton btnReserve;
    private JButton btnSearch;
    
    private JCheckBox chckbxA1;
    private JCheckBox chckbxA2;
    private JCheckBox chckbxA3;
    private JCheckBox chckbxA4;
    private JCheckBox chckbxA5;
    private JCheckBox chckbxA6;
    private JCheckBox chckbxA7;
    private JCheckBox chckbxA8;
    private JCheckBox chckbxA9;
    private JCheckBox chckbxA10;
    private JCheckBox chckbxA11;
    private JCheckBox chckbxA12;
    private JCheckBox chckbxA13;
    private JCheckBox chckbxB1;
    private JCheckBox chckbxB2;
    private JCheckBox chckbxB3;
    private JCheckBox chckbxB4;
    private JCheckBox chckbxB5;
    private JCheckBox chckbxB6;
    private JCheckBox chckbxB7;
    private JCheckBox chckbxB8;
    private JCheckBox chckbxB9;
    private JCheckBox chckbxB10;
    private JCheckBox chckbxB11;
    private JCheckBox chckbxB12;
    private JCheckBox chckbxB13;
    private JCheckBox chckbxC1;
    private JCheckBox chckbxC2;
    private JCheckBox chckbxC3;
    private JCheckBox chckbxC4;
    private JCheckBox chckbxC5;
    private JCheckBox chckbxC6;
    private JCheckBox chckbxC7;
    private JCheckBox chckbxC8;
    private JCheckBox chckbxC9;
    private JCheckBox chckbxC10;
    private JCheckBox chckbxC11;
    private JCheckBox chckbxC12;
    private JCheckBox chckbxC13;
    private JCheckBox chckbxD1;
    private JCheckBox chckbxD2;
    private JCheckBox chckbxD3;
    private JCheckBox chckbxD4;
    private JCheckBox chckbxD5;
    private JCheckBox chckbxD6;
    private JCheckBox chckbxD7;
    private JCheckBox chckbxD8;
    private JCheckBox chckbxD9;
    private JCheckBox chckbxD10;
    private JCheckBox chckbxD11;
    private JCheckBox chckbxD12;
    private JCheckBox chckbxD13;
    private JCheckBox chckbxE1;
    private JCheckBox chckbxE2;
    private JCheckBox chckbxE3;
    private JCheckBox chckbxE4;
    private JCheckBox chckbxE5;
    private JCheckBox chckbxE6;
    private JCheckBox chckbxE7;
    private JCheckBox chckbxE8;
    private JCheckBox chckbxE9;
    private JCheckBox chckbxE10;
    private JCheckBox chckbxE11;
    private JCheckBox chckbxE12;
    private JCheckBox chckbxE13;
    private ArrayList<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
    
    private JLabel lblScreen;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JLabel lbl4;
    private JLabel lbl5;
    private JLabel lbl6;
    private JLabel lbl7;
    private JLabel lbl8;
    private JLabel lbl9;
    private JLabel lbl10;
    private JLabel lbl11;
    private JLabel lbl12;
    private JLabel lbl13;
    private JLabel lblD;
    private JLabel lblE;
    private JButton btnManager;
    private JTextArea textSeat;
    private JComboBox comboTime;
    private ButtonGroup adultB = new ButtonGroup();
    private ButtonGroup childB = new ButtonGroup();
    
    ArrayList<Info> a = new ArrayList<Info>();
    private InfoDao dao = InfoDao.getInstance();
    private boolean anySeatsChecked = false;
    private JTextField textPassWord;
    private JLabel lblPassword;
    private JTextField textMPassword;
    private int seatCount = 0;
    private int radioACount = 0;
    private int radioCCount = 0;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    s window = new s();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public s() {
        initialize();

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("영화예매");
        frame.getContentPane().setForeground(new Color(255, 255, 255));
        frame.getContentPane().setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        frame.getContentPane().setBackground(new Color(128, 64, 64));
        frame.setBounds(100, 100, 1120, 641);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(49, 35, 596, 348);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        chckbxA1 = new JCheckBox("");
        chckbxA1.setName("A1");
        checkBoxes.add(chckbxA1);
        chckbxA1.setBackground(new Color(255, 255, 255));
        chckbxA1.setBounds(100, 106, 26, 36);
        panel.add(chckbxA1);

        chckbxA2 = new JCheckBox("");
        chckbxA2.setName("A2");
        checkBoxes.add(chckbxA2);
        chckbxA2.setBackground(Color.WHITE);
        chckbxA2.setBounds(130, 106, 26, 36);
        panel.add(chckbxA2);

        chckbxA3 = new JCheckBox("");
        chckbxA3.setName("A3");
        checkBoxes.add(chckbxA3);
        chckbxA3.setBackground(Color.WHITE);
        chckbxA3.setBounds(160, 106, 26, 36);
        panel.add(chckbxA3);

        chckbxA4 = new JCheckBox("");
        chckbxA4.setName("A4");
        checkBoxes.add(chckbxA4);
        chckbxA4.setBackground(Color.WHITE);
        chckbxA4.setBounds(190, 106, 26, 36);
        panel.add(chckbxA4);

        chckbxA5 = new JCheckBox("");
        chckbxA5.setName("A5");
        checkBoxes.add(chckbxA5);
        chckbxA5.setBackground(Color.WHITE);
        chckbxA5.setBounds(220, 106, 26, 36);
        panel.add(chckbxA5);

        chckbxA6 = new JCheckBox("");
        chckbxA6.setName("A6");
        checkBoxes.add(chckbxA6);
        chckbxA6.setBackground(Color.WHITE);
        chckbxA6.setBounds(250, 106, 26, 36);
        panel.add(chckbxA6);

        chckbxA7 = new JCheckBox("");
        chckbxA7.setName("A7");
        checkBoxes.add(chckbxA7);
        chckbxA7.setBackground(Color.WHITE);
        chckbxA7.setBounds(280, 106, 26, 36);
        panel.add(chckbxA7);

        chckbxA8 = new JCheckBox("");
        chckbxA8.setName("A8");
        checkBoxes.add(chckbxA8);
        chckbxA8.setBackground(Color.WHITE);
        chckbxA8.setBounds(310, 106, 26, 36);
        panel.add(chckbxA8);

        chckbxA9 = new JCheckBox("");
        chckbxA9.setName("A9");
        checkBoxes.add(chckbxA9);
        chckbxA9.setBackground(Color.WHITE);
        chckbxA9.setBounds(340, 106, 26, 36);
        panel.add(chckbxA9);

        chckbxA10 = new JCheckBox("");
        chckbxA10.setName("A10");
        checkBoxes.add(chckbxA10);
        chckbxA10.setBackground(Color.WHITE);
        chckbxA10.setBounds(370, 106, 26, 36);
        panel.add(chckbxA10);

        chckbxA11 = new JCheckBox("");
        chckbxA11.setName("A11");
        checkBoxes.add(chckbxA11);
        chckbxA11.setBackground(Color.WHITE);
        chckbxA11.setBounds(400, 106, 26, 36);
        panel.add(chckbxA11);

        chckbxA12 = new JCheckBox("");
        chckbxA12.setName("A12");
        checkBoxes.add(chckbxA12);
        chckbxA12.setBackground(Color.WHITE);
        chckbxA12.setBounds(430, 106, 26, 36);
        panel.add(chckbxA12);

        chckbxA13 = new JCheckBox("");
        chckbxA13.setName("A13");
        checkBoxes.add(chckbxA13);
        chckbxA13.setBackground(Color.WHITE);
        chckbxA13.setBounds(460, 106, 26, 36);
        panel.add(chckbxA13);

        chckbxB1 = new JCheckBox("");
        chckbxB1.setName("B1");
        checkBoxes.add(chckbxB1);
        chckbxB1.setBackground(Color.WHITE);
        chckbxB1.setBounds(100, 141, 26, 36);
        panel.add(chckbxB1);

        chckbxB2 = new JCheckBox("");
        chckbxB2.setName("B2");
        checkBoxes.add(chckbxB2);
        chckbxB2.setBackground(Color.WHITE);
        chckbxB2.setBounds(130, 141, 26, 36);
        panel.add(chckbxB2);

        chckbxB3 = new JCheckBox("");
        chckbxB3.setName("B3");
        checkBoxes.add(chckbxB3);
        chckbxB3.setBackground(Color.WHITE);
        chckbxB3.setBounds(160, 141, 26, 36);
        panel.add(chckbxB3);

        chckbxB4 = new JCheckBox("");
        chckbxB4.setName("B4");
        checkBoxes.add(chckbxB4);
        chckbxB4.setBackground(Color.WHITE);
        chckbxB4.setBounds(190, 141, 26, 36);
        panel.add(chckbxB4);

        chckbxB5 = new JCheckBox("");
        chckbxB5.setName("B5");
        checkBoxes.add(chckbxB5);
        chckbxB5.setBackground(Color.WHITE);
        chckbxB5.setBounds(220, 141, 26, 36);
        panel.add(chckbxB5);

        chckbxB6 = new JCheckBox("");
        chckbxB6.setName("B6");
        checkBoxes.add(chckbxB6);
        chckbxB6.setBackground(Color.WHITE);
        chckbxB6.setBounds(250, 141, 26, 36);
        panel.add(chckbxB6);

        chckbxB7 = new JCheckBox("");
        chckbxB7.setName("B7");
        checkBoxes.add(chckbxB7);
        chckbxB7.setBackground(Color.WHITE);
        chckbxB7.setBounds(280, 141, 26, 36);
        panel.add(chckbxB7);

        chckbxB8 = new JCheckBox("");
        chckbxB8.setName("B8");
        checkBoxes.add(chckbxB8);
        chckbxB8.setBackground(Color.WHITE);
        chckbxB8.setBounds(310, 141, 26, 36);
        panel.add(chckbxB8);

        chckbxB9 = new JCheckBox("");
        chckbxB9.setName("B9");
        checkBoxes.add(chckbxB9);
        chckbxB9.setBackground(Color.WHITE);
        chckbxB9.setBounds(340, 141, 26, 36);
        panel.add(chckbxB9);

        chckbxB10 = new JCheckBox("");
        chckbxB10.setName("B10");
        checkBoxes.add(chckbxB10);
        chckbxB10.setBackground(Color.WHITE);
        chckbxB10.setBounds(370, 141, 26, 36);
        panel.add(chckbxB10);

        chckbxB11 = new JCheckBox("");
        chckbxB11.setName("B11");
        checkBoxes.add(chckbxB11);
        chckbxB11.setBackground(Color.WHITE);
        chckbxB11.setBounds(400, 141, 26, 36);
        panel.add(chckbxB11);

        chckbxB12 = new JCheckBox("");
        chckbxB12.setName("B12");
        checkBoxes.add(chckbxB12);
        chckbxB12.setBackground(Color.WHITE);
        chckbxB12.setBounds(430, 141, 26, 36);
        panel.add(chckbxB12);

        chckbxB13 = new JCheckBox("");
        chckbxB13.setName("B13");
        checkBoxes.add(chckbxB13);
        chckbxB13.setBackground(Color.WHITE);
        chckbxB13.setBounds(460, 141, 26, 36);
        panel.add(chckbxB13);

        chckbxC1 = new JCheckBox("");
        chckbxC1.setName("C1");
        checkBoxes.add(chckbxC1);
        chckbxC1.setBackground(Color.WHITE);
        chckbxC1.setBounds(100, 176, 26, 36);
        panel.add(chckbxC1);

        chckbxC2 = new JCheckBox("");
        chckbxC2.setName("C2");
        checkBoxes.add(chckbxC2);
        chckbxC2.setBackground(Color.WHITE);
        chckbxC2.setBounds(130, 176, 26, 36);
        panel.add(chckbxC2);

        chckbxC3 = new JCheckBox("");
        chckbxC3.setName("C3");
        checkBoxes.add(chckbxC3);
        chckbxC3.setBackground(Color.WHITE);
        chckbxC3.setBounds(160, 176, 26, 36);
        panel.add(chckbxC3);

        chckbxC4 = new JCheckBox("");
        chckbxC4.setName("C4");
        checkBoxes.add(chckbxC4);
        chckbxC4.setBackground(Color.WHITE);
        chckbxC4.setBounds(190, 176, 26, 36);
        panel.add(chckbxC4);

        chckbxC5 = new JCheckBox("");
        chckbxC5.setName("C5");
        checkBoxes.add(chckbxC5);
        chckbxC5.setBackground(Color.WHITE);
        chckbxC5.setBounds(220, 176, 26, 36);
        panel.add(chckbxC5);

        chckbxC6 = new JCheckBox("");
        chckbxC6.setName("C6");
        checkBoxes.add(chckbxC6);
        chckbxC6.setBackground(Color.WHITE);
        chckbxC6.setBounds(250, 176, 26, 36);
        panel.add(chckbxC6);

        chckbxC7 = new JCheckBox("");
        chckbxC7.setName("C7");
        checkBoxes.add(chckbxC7);
        chckbxC7.setBackground(Color.WHITE);
        chckbxC7.setBounds(280, 176, 26, 36);
        panel.add(chckbxC7);

        chckbxC8 = new JCheckBox("");
        chckbxC8.setName("C8");
        checkBoxes.add(chckbxC8);
        chckbxC8.setBackground(Color.WHITE);
        chckbxC8.setBounds(310, 176, 26, 36);
        panel.add(chckbxC8);

        chckbxC9 = new JCheckBox("");
        chckbxC9.setName("C9");
        checkBoxes.add(chckbxC9);
        chckbxC9.setBackground(Color.WHITE);
        chckbxC9.setBounds(340, 176, 26, 36);
        panel.add(chckbxC9);

        chckbxC10 = new JCheckBox("");
        chckbxC10.setName("C10");
        checkBoxes.add(chckbxC10);
        chckbxC10.setBackground(Color.WHITE);
        chckbxC10.setBounds(370, 176, 26, 36);
        panel.add(chckbxC10);

        chckbxC11 = new JCheckBox("");
        chckbxC11.setName("C11");
        checkBoxes.add(chckbxC11);
        chckbxC11.setBackground(Color.WHITE);
        chckbxC11.setBounds(400, 176, 26, 36);
        panel.add(chckbxC11);

        chckbxC12 = new JCheckBox("");
        chckbxC12.setName("C12");
        checkBoxes.add(chckbxC12);
        chckbxC12.setBackground(Color.WHITE);
        chckbxC12.setBounds(430, 176, 26, 36);
        panel.add(chckbxC12);

        chckbxC13 = new JCheckBox("");
        chckbxC13.setName("C13");
        checkBoxes.add(chckbxC13);
        chckbxC13.setBackground(Color.WHITE);
        chckbxC13.setBounds(460, 176, 26, 36);
        panel.add(chckbxC13);

        chckbxD1 = new JCheckBox("");
        chckbxD1.setName("D1");
        checkBoxes.add(chckbxD1);
        chckbxD1.setBackground(Color.WHITE);
        chckbxD1.setBounds(100, 211, 26, 36);
        panel.add(chckbxD1);

        chckbxD2 = new JCheckBox("");
        chckbxD2.setName("D2");
        checkBoxes.add(chckbxD2);
        chckbxD2.setBackground(Color.WHITE);
        chckbxD2.setBounds(130, 211, 26, 36);
        panel.add(chckbxD2);

        chckbxD3 = new JCheckBox("");
        chckbxD3.setName("D3");
        checkBoxes.add(chckbxD3);
        chckbxD3.setBackground(Color.WHITE);
        chckbxD3.setBounds(160, 211, 26, 36);
        panel.add(chckbxD3);

        chckbxD4 = new JCheckBox("");
        chckbxD4.setName("D4");
        checkBoxes.add(chckbxD4);
        chckbxD4.setBackground(Color.WHITE);
        chckbxD4.setBounds(190, 211, 26, 36);
        panel.add(chckbxD4);

        chckbxD5 = new JCheckBox("");
        chckbxD5.setName("D5");
        checkBoxes.add(chckbxD5);
        chckbxD5.setBackground(Color.WHITE);
        chckbxD5.setBounds(220, 211, 26, 36);
        panel.add(chckbxD5);

        chckbxD6 = new JCheckBox("");
        chckbxD6.setName("D6");
        checkBoxes.add(chckbxD6);
        chckbxD6.setBackground(Color.WHITE);
        chckbxD6.setBounds(250, 211, 26, 36);
        panel.add(chckbxD6);

        chckbxD7 = new JCheckBox("");
        chckbxD7.setName("D7");
        checkBoxes.add(chckbxD7);
        chckbxD7.setBackground(Color.WHITE);
        chckbxD7.setBounds(280, 211, 26, 36);
        panel.add(chckbxD7);

        chckbxD8 = new JCheckBox("");
        chckbxD8.setName("D8");
        checkBoxes.add(chckbxD8);
        chckbxD8.setBackground(Color.WHITE);
        chckbxD8.setBounds(310, 211, 26, 36);
        panel.add(chckbxD8);

        chckbxD9 = new JCheckBox("");
        chckbxD9.setName("D19");
        checkBoxes.add(chckbxD9);
        chckbxD9.setBackground(Color.WHITE);
        chckbxD9.setBounds(340, 211, 26, 36);
        panel.add(chckbxD9);

        chckbxD10 = new JCheckBox("");
        chckbxD10.setName("D10");
        checkBoxes.add(chckbxD10);
        chckbxD10.setBackground(Color.WHITE);
        chckbxD10.setBounds(370, 211, 26, 36);
        panel.add(chckbxD10);

        chckbxD11 = new JCheckBox("");
        chckbxD11.setName("D11");
        checkBoxes.add(chckbxD11);
        chckbxD11.setBackground(Color.WHITE);
        chckbxD11.setBounds(400, 211, 26, 36);
        panel.add(chckbxD11);

        chckbxD12 = new JCheckBox("");
        chckbxD12.setName("D12");
        checkBoxes.add(chckbxD12);
        chckbxD12.setBackground(Color.WHITE);
        chckbxD12.setBounds(430, 211, 26, 36);
        panel.add(chckbxD12);

        chckbxD13 = new JCheckBox("");
        chckbxD13.setName("D13");
        checkBoxes.add(chckbxD13);
        chckbxD13.setBackground(Color.WHITE);
        chckbxD13.setBounds(460, 211, 26, 36);
        panel.add(chckbxD13);

        chckbxE1 = new JCheckBox("");
        chckbxE1.setName("E1");
        checkBoxes.add(chckbxE1);
        chckbxE1.setBackground(Color.WHITE);
        chckbxE1.setBounds(100, 246, 26, 36);
        panel.add(chckbxE1);

        chckbxE2 = new JCheckBox("");
        chckbxE2.setName("E2");
        checkBoxes.add(chckbxE2);
        chckbxE2.setBackground(Color.WHITE);
        chckbxE2.setBounds(130, 246, 26, 36);
        panel.add(chckbxE2);

        chckbxE3 = new JCheckBox("");
        chckbxE3.setName("E3");
        checkBoxes.add(chckbxE3);
        chckbxE3.setBackground(Color.WHITE);
        chckbxE3.setBounds(160, 246, 26, 36);
        panel.add(chckbxE3);

        chckbxE4 = new JCheckBox("");
        chckbxE4.setName("E4");
        checkBoxes.add(chckbxE4);
        chckbxE4.setBackground(Color.WHITE);
        chckbxE4.setBounds(190, 246, 26, 36);
        panel.add(chckbxE4);

        chckbxE5 = new JCheckBox("");
        chckbxE5.setName("E5");
        checkBoxes.add(chckbxE5);
        chckbxE5.setBackground(Color.WHITE);
        chckbxE5.setBounds(220, 246, 26, 36);
        panel.add(chckbxE5);

        chckbxE6 = new JCheckBox("");
        chckbxE6.setName("E6");
        checkBoxes.add(chckbxE6);
        chckbxE6.setBackground(Color.WHITE);
        chckbxE6.setBounds(250, 246, 26, 36);
        panel.add(chckbxE6);

        chckbxE7 = new JCheckBox("");
        chckbxE7.setName("E7");
        checkBoxes.add(chckbxE7);
        chckbxE7.setBackground(Color.WHITE);
        chckbxE7.setBounds(280, 246, 26, 36);
        panel.add(chckbxE7);

        chckbxE8 = new JCheckBox("");
        chckbxE8.setName("E8");
        checkBoxes.add(chckbxE8);
        chckbxE8.setBackground(Color.WHITE);
        chckbxE8.setBounds(310, 246, 26, 36);
        panel.add(chckbxE8);

        chckbxE9 = new JCheckBox("");
        chckbxE9.setName("E9");
        checkBoxes.add(chckbxE9);
        chckbxE9.setBackground(Color.WHITE);
        chckbxE9.setBounds(340, 246, 26, 36);
        panel.add(chckbxE9);

        chckbxE10 = new JCheckBox("");
        chckbxE10.setName("E10");
        checkBoxes.add(chckbxE10);
        chckbxE10.setBackground(Color.WHITE);
        chckbxE10.setBounds(370, 246, 26, 36);
        panel.add(chckbxE10);

        chckbxE11 = new JCheckBox("");
        chckbxE11.setName("E11");
        checkBoxes.add(chckbxE11);
        chckbxE11.setBackground(Color.WHITE);
        chckbxE11.setBounds(400, 246, 26, 36);
        panel.add(chckbxE11);

        chckbxE12 = new JCheckBox("");
        chckbxE12.setName("E12");
        checkBoxes.add(chckbxE12);
        chckbxE12.setBackground(Color.WHITE);
        chckbxE12.setBounds(430, 246, 26, 36);
        panel.add(chckbxE12);

        chckbxE13 = new JCheckBox("");
        chckbxE13.setName("E13");
        checkBoxes.add(chckbxE13);
        chckbxE13.setBackground(Color.WHITE);
        chckbxE13.setBounds(460, 246, 26, 36);
        panel.add(chckbxE13);
        
        //이 모든 콤보박스를 ArrayList를 통해 하나로 통제하기 위해 checkBoxes생성
        
        // checkBoxes에서 체크박스를 하나씩 뽑아낼때 
        // StringBuffer를 통해 선택할려는 체크박스 좌석을 textSeat에 출력 
        for (JCheckBox cb : checkBoxes) {
            cb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuffer buffer = new StringBuffer();
                    for (JCheckBox cb : checkBoxes) {
                        if (cb.isEnabled() && cb.isSelected()) {
                            buffer.append(cb.getName() + " ");
                        }
                    }
                    textSeat.setText(buffer.toString());
                    
                    //seatCount는 라디오버튼 인원선택과 동일한 개수의 좌석을 선택하기위해
                    //seatCount를 선택될때마다 세어줌으로써 라디오버튼의 등록된 개수와 비교
                    if (cb.isSelected()) {
                        seatCount++;
                     
                    } else {
                        seatCount--;
                    }
                    
                }
            });
        }

        lblScreen = new JLabel("S C R E E N");
        lblScreen.setFont(new Font("맑은 고딕", Font.ITALIC, 24));
        lblScreen.setForeground(new Color(128, 128, 128));
        lblScreen.setBackground(new Color(64, 0, 64));
        lblScreen.setBounds(230, 21, 136, 36);
        panel.add(lblScreen);

        lblA = new JLabel("A");
        lblA.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblA.setBounds(72, 113, 20, 15);
        panel.add(lblA);

        lblB = new JLabel("B");
        lblB.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblB.setBounds(72, 149, 20, 15);
        panel.add(lblB);

        lblC = new JLabel("C");
        lblC.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblC.setBounds(72, 186, 20, 15);
        panel.add(lblC);

        lbl1 = new JLabel("1");
        lbl1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl1.setBounds(106, 90, 20, 15);
        panel.add(lbl1);

        lbl2 = new JLabel("2");
        lbl2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl2.setBounds(134, 90, 20, 15);
        panel.add(lbl2);

        lbl3 = new JLabel("3");
        lbl3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl3.setBounds(164, 90, 20, 15);
        panel.add(lbl3);

        lbl4 = new JLabel("4");
        lbl4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl4.setBounds(194, 90, 20, 15);
        panel.add(lbl4);

        lbl5 = new JLabel("5");
        lbl5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl5.setBounds(224, 90, 20, 15);
        panel.add(lbl5);

        lbl6 = new JLabel("6");
        lbl6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl6.setBounds(254, 90, 20, 15);
        panel.add(lbl6);

        lbl7 = new JLabel("7");
        lbl7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl7.setBounds(284, 90, 20, 15);
        panel.add(lbl7);

        lbl8 = new JLabel("8");
        lbl8.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl8.setBounds(314, 90, 20, 15);
        panel.add(lbl8);

        lbl9 = new JLabel("9");
        lbl9.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl9.setBounds(344, 90, 20, 15);
        panel.add(lbl9);

        lbl10 = new JLabel("10");
        lbl10.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl10.setBounds(370, 90, 20, 15);
        panel.add(lbl10);

        lbl11 = new JLabel("11");
        lbl11.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl11.setBounds(400, 90, 20, 15);
        panel.add(lbl11);

        lbl12 = new JLabel("12");
        lbl12.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl12.setBounds(430, 90, 20, 15);
        panel.add(lbl12);

        lbl13 = new JLabel("13");
        lbl13.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lbl13.setBounds(460, 90, 20, 15);
        panel.add(lbl13);

        lblD = new JLabel("D");
        lblD.setVerticalAlignment(SwingConstants.BOTTOM);
        lblD.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblD.setBounds(72, 221, 20, 15);
        panel.add(lblD);

        lblE = new JLabel("E");
        lblE.setFont(new Font("맑은 고딕", Font.BOLD, 12));
        lblE.setBounds(72, 256, 20, 15);
        panel.add(lblE);

        lblAbult = new JLabel("성인 (14000원)");
        lblAbult.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        lblAbult.setForeground(new Color(255, 255, 255));
        lblAbult.setBounds(693, 68, 154, 50);
        frame.getContentPane().add(lblAbult);

        rdbtnAbult1 = new JRadioButton("1");
        rdbtnAbult1.setName("14000");
        rdbtnAbult1.setForeground(new Color(255, 255, 255));
        rdbtnAbult1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnAbult1.setBackground(new Color(128, 64, 64));
        rdbtnAbult1.setBounds(855, 82, 42, 23);
        frame.getContentPane().add(rdbtnAbult1);
        adultB.add(rdbtnAbult1);
    
        rdbtnAbult2 = new JRadioButton("2");
        rdbtnAbult2.setName("28000");
        rdbtnAbult2.setForeground(Color.WHITE);
        rdbtnAbult2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnAbult2.setBackground(new Color(128, 64, 64));
        rdbtnAbult2.setBounds(911, 82, 42, 23);
        frame.getContentPane().add(rdbtnAbult2);
        adultB.add(rdbtnAbult2);

        rdbtnAbult3 = new JRadioButton("3");
        rdbtnAbult3.setName("42000");
        rdbtnAbult3.setForeground(Color.WHITE);
        rdbtnAbult3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnAbult3.setBackground(new Color(128, 64, 64));
        rdbtnAbult3.setBounds(968, 82, 42, 23);
        frame.getContentPane().add(rdbtnAbult3);
        adultB.add(rdbtnAbult3);

        rdbtnAbult4 = new JRadioButton("4");
        rdbtnAbult4.setName("56000");
        rdbtnAbult4.setForeground(Color.WHITE);
        rdbtnAbult4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnAbult4.setBackground(new Color(128, 64, 64));
        rdbtnAbult4.setBounds(1023, 82, 42, 23);
        frame.getContentPane().add(rdbtnAbult4);
        adultB.add(rdbtnAbult4);

        lblChild = new JLabel("청소년 (9000원)");
        lblChild.setForeground(Color.WHITE);
        lblChild.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        lblChild.setBounds(693, 111, 154, 50);
        frame.getContentPane().add(lblChild);

        rdbtnChild1 = new JRadioButton("1");
        rdbtnChild1.setName("9000");
        rdbtnChild1.setForeground(Color.WHITE);
        rdbtnChild1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnChild1.setBackground(new Color(128, 64, 64));
        rdbtnChild1.setBounds(855, 125, 42, 23);
        frame.getContentPane().add(rdbtnChild1);
        childB.add(rdbtnChild1);

        rdbtnChild2 = new JRadioButton("2");
        rdbtnChild2.setName("18000");
        rdbtnChild2.setForeground(Color.WHITE);
        rdbtnChild2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnChild2.setBackground(new Color(128, 64, 64));
        rdbtnChild2.setBounds(911, 125, 42, 23);
        frame.getContentPane().add(rdbtnChild2);
        childB.add(rdbtnChild2);

        rdbtnChild3 = new JRadioButton("3");
        rdbtnChild3.setName("27000");
        rdbtnChild3.setForeground(Color.WHITE);
        rdbtnChild3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnChild3.setBackground(new Color(128, 64, 64));
        rdbtnChild3.setBounds(968, 125, 42, 23);
        frame.getContentPane().add(rdbtnChild3);
        childB.add(rdbtnChild3);

        rdbtnChild4 = new JRadioButton("4");
        rdbtnChild4.setName("36000");
        rdbtnChild4.setForeground(Color.WHITE);
        rdbtnChild4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        rdbtnChild4.setBackground(new Color(128, 64, 64));
        rdbtnChild4.setBounds(1023, 125, 42, 23);
        frame.getContentPane().add(rdbtnChild4);
        childB.add(rdbtnChild4);

        lblPSelect = new JLabel("인원선택(명)");
        lblPSelect.setForeground(new Color(255, 255, 255));
        lblPSelect.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblPSelect.setBounds(693, 35, 163, 33);
        frame.getContentPane().add(lblPSelect);

        lblTSelect = new JLabel("시간선택");
        lblTSelect.setForeground(new Color(255, 255, 255));
        lblTSelect.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblTSelect.setBounds(698, 182, 114, 33);
        frame.getContentPane().add(lblTSelect);

        lblInfo = new JLabel("예매자 정보");
        lblInfo.setForeground(Color.WHITE);
        lblInfo.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblInfo.setBounds(698, 283, 114, 33);
        frame.getContentPane().add(lblInfo);

        lblName = new JLabel("이름");
        lblName.setForeground(Color.WHITE);
        lblName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblName.setBounds(708, 326, 114, 33);
        frame.getContentPane().add(lblName);

        textName = new JTextField();
        textName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textName.setBounds(824, 326, 140, 32);
        frame.getContentPane().add(textName);
        textName.setColumns(10);

        lblPhone = new JLabel("전화번호");
        lblPhone.setForeground(Color.WHITE);
        lblPhone.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblPhone.setBounds(706, 372, 114, 33);
        frame.getContentPane().add(lblPhone);

        textPhone = new JTextField();
        textPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textPhone.setColumns(10);
        textPhone.setBounds(824, 373, 260, 32);
        frame.getContentPane().add(textPhone);

        lblEmail = new JLabel("이메일");
        lblEmail.setForeground(Color.WHITE);
        lblEmail.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblEmail.setBounds(706, 419, 114, 33);
        frame.getContentPane().add(lblEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textEmail.setColumns(10);
        textEmail.setBounds(824, 419, 260, 32);
        frame.getContentPane().add(textEmail);

        btnReserve = new JButton("예매");
        btnReserve.setForeground(new Color(255, 255, 255));
        btnReserve.setBackground(new Color(243, 84, 75));
        btnReserve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //예매버튼 클릭시 작동되는 모든과정을 save에 등록
                Save();
            }
        });

        btnReserve.setFont(new Font("맑은 고딕", Font.BOLD, 24));
        btnReserve.setBounds(762, 517, 114, 65);
        frame.getContentPane().add(btnReserve);

        btnSearch = new JButton("예매조회");
        btnSearch.setForeground(new Color(255, 255, 255));
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 예매조회 선택시 search(Jframe)에서 작동, 페이지 
                search.SearchPerson(frame);
            }
        });
        btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnSearch.setBackground(new Color(243, 83, 75));
        btnSearch.setBounds(925, 520, 129, 58);
        frame.getContentPane().add(btnSearch);

        comboTime = new JComboBox();
        comboTime.setModel(new DefaultComboBoxModel(new String[] {"시간선택", "09:00", "12:40", "16:20", "20:20"}));
        comboTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                //시간 콤보박스를 선택할때 마다 좌석도 항상 다르기 때문에 
                // 시간을 선택할때 마다 timeSelect()를 통해 다르게 좌석표시
                if (comboTime.getSelectedItem().toString().equals("09:00")) {
                    timeSelect();
                 } else if (comboTime.getSelectedItem().toString().equals("12:40")) {
                        timeSelect();
                }else if (comboTime.getSelectedItem().toString().equals("16:20")) {
                    timeSelect();
                }  else if (comboTime.getSelectedItem().toString().equals("20:20")) {
                    timeSelect();
                } else {
                    for (JCheckBox cb : checkBoxes) {
                        cb.setEnabled(false);}  
                }
            }
        });
        comboTime.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        comboTime.setBackground(new Color(255, 255, 255));

        comboTime.setBounds(693, 225, 254, 37);
        frame.getContentPane().add(comboTime);

        btnManager = new JButton("관리자모드");
        btnManager.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 관리자모드 버튼 클릭시 설정된 패스워드와 같다면
                // manager(Jframe)에 작동, 페이지 
                String password = "itwill";
                if (textMPassword.getText().equals(password)) {
                    manager.mangerMode(frame);
                    textMPassword.setText("");
                }
            }
        });
        btnManager.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        btnManager.setBounds(336, 511, 295, 50);
        frame.getContentPane().add(btnManager);

        textSeat = new JTextArea();
        textSeat.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
        textSeat.setEditable(false);
        textSeat.setBounds(59, 399, 572, 85);
        frame.getContentPane().add(textSeat);

        lblPassword = new JLabel("비밀번호");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblPassword.setBounds(708, 462, 114, 33);
        frame.getContentPane().add(lblPassword);

        textPassWord = new JPasswordField();
        textPassWord.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textPassWord.setColumns(10);
        textPassWord.setBounds(824, 461, 260, 32);
        frame.getContentPane().add(textPassWord);

        textMPassword = new JPasswordField();
        textMPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
        textMPassword.setColumns(10);
        textMPassword.setBounds(64, 520, 260, 32);
        frame.getContentPane().add(textMPassword);

    }
    
    // 시간 콤보박스 선택시 시간마다 예매되어있는 좌석 비활성화 
    private void timeSelect() {
        // dao의 TimeSeat메서드에서 
        // 예시로 09:00가 선택되었을 때 db에서 09:00로 예매한 회원정보를 가져와
        // ArrayList time에 저장 
        ArrayList<Info> time = (ArrayList<Info>) dao.TimeSeat(comboTime.getSelectedItem().toString());
        ArrayList<String> registered = new ArrayList<>();
        // 시간에 따라 저장된 예매한 회원정보 한개씩 출력
        for (Info info : time) {
            // 회원정보 한개 안에서 좌석 정보를 출력
            // 단, 좌석 정보가 하나씩이 아닌 긴 공백이 포함된 문자열이기에
            // split으로 구별해 좌석이름만 하나씩 문자열로 만들기
            String[] seats = info.getSeat().split(" ");
            for (String s : seats) {
                //하나씩 좌석이름이 출력된 문자열을 ArrayList registered 새로운 리스트에 추가
                registered.add(s);
            }
        }
        
        // 좌석 체크박스를 하나씩 가져와 좌석마다 설정된 이름을 
        // ArrayList registered 에 한개씩 문자열과 비교
        // 그것에 따라 일치한다면 좌석 체크박스를 선택하지 못하게 설정
        for (JCheckBox cb : checkBoxes) {
            if (registered.contains(cb.getName())) {
                cb.setEnabled(false);
            } else {
                cb.setEnabled(true);
            }
        }

    }
    
    // 예매 버튼 클릭시 작동하는 메서드
    private void Save() {
        // 초기값 생성
        String name = null;
        String phone = null;
        String email = null;
        String time = null;
        String seat = null;
        int money = 0;
        String password = null;

        // 이름, 전화번호, 이메일, 비밀번호를 입력 안했을시 오류
        if (textName.getText().equals("") || textPhone.getText().equals("") || textEmail.getText().equals("")
                || textPassWord.getText().equals("")) {
            JOptionPane.showMessageDialog(frame, "예매자 정보를 입력해주세요", "예약정보 문제", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 라디오버튼 인원을 선택 안했을시 오류
        if (adultB.getSelection() == null && childB.getSelection() == null) {
            JOptionPane.showMessageDialog(frame, "인원을 선택해주세요", "오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 좌석을 선택안했을시 오류
        anySeatsChecked = false;
        for (JCheckBox cb : checkBoxes) {
            if (cb.isSelected()) {
                anySeatsChecked = true;
                break;

            }
        }
        if (!anySeatsChecked) {
            JOptionPane.showMessageDialog(frame, "좌석을 선택해주세요", "오류", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 라디오 버튼에서 선택한 인원수 만큼 좌석 수도 그이상 선택하면 오류
        if (rdbtnAbult1.isSelected()) {
            radioACount = 1;
        } else if (rdbtnAbult2.isSelected()) {
            radioACount = 2;
        } else if (rdbtnAbult3.isSelected()) {
            radioACount = 3;
        } else if (rdbtnAbult4.isSelected()) {
            radioACount = 4;
        }

        if (rdbtnChild1.isSelected()) {
            radioCCount = 1;
        } else if (rdbtnChild2.isSelected()) {
            radioCCount = 2;
        } else if (rdbtnChild3.isSelected()) {
            radioCCount = 3;
        } else if (rdbtnChild4.isSelected()) {
            radioCCount = 4;
        }

        if (seatCount > (radioACount + radioCCount) || seatCount  < (radioACount + radioCCount)) {
            JOptionPane.showMessageDialog(frame, "인원 수에 맞게 다시 좌석 선택해주세요", "좌석문제", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 좌석중에 선택된 값이 있다면 좌석을 못선택하게하기
        for (JCheckBox cb : checkBoxes) {

            if (cb.isSelected()) {
                cb.setEnabled(false);
            }
        }

        // 라디오버튼 선택시 성인인원당 금액, 청소년인원당 금액을 꺼내오기
        String num = "0";
        if (rdbtnAbult1.isSelected()) {
            num = rdbtnAbult1.getName();
        } else if (rdbtnAbult2.isSelected()) {
            num = rdbtnAbult2.getName();
        } else if (rdbtnAbult3.isSelected()) {
            num = rdbtnAbult3.getName();
        } else if (rdbtnAbult4.isSelected()) {
            num = rdbtnAbult4.getName();
        }

        String num2 = "0";
        if (rdbtnChild1.isSelected()) {
            num2 = rdbtnChild1.getName();
        } else if (rdbtnChild2.isSelected()) {
            num2 = rdbtnChild2.getName();
        } else if (rdbtnChild3.isSelected()) {
            num2 = rdbtnChild3.getName();
        } else if (rdbtnChild4.isSelected()) {
            num2 = rdbtnChild4.getName();
        }

        int pay = Integer.parseInt(num);
        int pay2 = Integer.parseInt(num2);
       
        if (comboTime.getSelectedItem().toString().equals("시간선택")) {
            JOptionPane.showMessageDialog(frame, "시간을 다시선택해주세요", "시간선택", JOptionPane.ERROR_MESSAGE);
            return;
        }
        name = textName.getText();
        phone = textPhone.getText();
        email = textEmail.getText();
        time = comboTime.getSelectedItem().toString();
        seat = textSeat.getText();
        password = textPassWord.getText();
        money = pay + pay2;

        if (comboTime.getSelectedItem().toString().equals("시간선택")) {
            JOptionPane.showMessageDialog(frame, "시간을 다시선택해주세요", "시간선택", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Info info = new Info(name, phone, email, time, seat, money, password);

        // DB에 입력한 정보를 넘겨주기
        dao.create(info);

        // 예매완료
        JOptionPane.showMessageDialog(frame, "예매완료", "예매", JOptionPane.INFORMATION_MESSAGE);

        // 좌석선택시 좌석을 알려주는 텍스트를 리셋
        textSeat.setText("");
        textName.setText("");
        textPhone.setText("");
        textEmail.setText("");
        textPassWord.setText("");
       for(JCheckBox cb: checkBoxes) {
           cb.setSelected(false);
       }
       


       
        seatCount = 0;
        return;
    }

}
