package com.itwill.controllerp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itwill.view.Info;

import oracle.jdbc.OracleDriver;

import static com.itwill.jdbcp.OracleJdbc.*;


public class InfoDao {
    
    //싱글톤 생성
    private static InfoDao instance = null;
    
    private InfoDao() { 
        try {
            DriverManager.registerDriver(new OracleDriver());
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
    
    public static InfoDao getInstance() {
        if (instance ==null) {
            instance = new InfoDao();
        }
        return instance;
    }

    
    
    // read메서드- db에 저장된 모든정보를 가져온다 
    public static final String Info=
            "select * from Info";
    

    public ArrayList<Info> read() {
        ArrayList<Info> a = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
        try {
            // 오라클 데이터베이스에 접속(세션 생성)
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            // 실행할  Statement 객체를 생성
            stmt = conn.prepareStatement(Info);
            // SQl문장을 데이터베이스에서 실행
            rs =stmt.executeQuery();
            
        
            while(rs.next()) {
                String name =rs.getString("NAME");
                String phone = rs.getString("PHONE");
                String email = rs.getString("EMAIL");
                String time = rs.getString("TIME");
                String seat = rs.getString("SEAT");
                int money = rs.getInt("PAY");
                String password = rs.getString("PASSWORD");
                
                Info info = new Info(name, phone, email, time, seat, money,password);
                a.add(info);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        return a;
    }
    
    
    // create메서드 - 예매시 입력한 한명의 회원정보를 받아온뒤 insert를 통해 db에 추가저장
    public static final String INFO_INSERT = 
            "insert into Info (name, phone, email, time, seat, pay, password) values (?, ?, ?, ?, ?, ?, ?)";
    
    public int create(Info info) {
        int result = 0;
        
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.prepareStatement(INFO_INSERT);
            stmt.setString(1, info.getName());
            stmt.setString(2, info.getPhone());
            stmt.setString(3, info.getEmail());
            stmt.setString(4, info.getTime());
            stmt.setString(5, info.getSeat());
            stmt.setInt(6, info.getMoney());
            stmt.setString(7, info.getPassword());
            result = stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
        
        return result;
    }
    
    
    //search메서드 - db에서 이름, 전화번호, 이메일 중에서 입력받은 것중에 하나라도 일치하면 일치하는 정보를 호출하는 메서드
    public static final String SEARCH_INFO = 
            "select * from Info " +
            "where lower(name) like ? or lower(phone) like ? or lower(email) like ? "+
            "order by name";
    
    public Info search(String name, String phone, String email) {
        
        Info info = null;
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.prepareStatement(SEARCH_INFO);
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, email);
            rs = stmt.executeQuery();
            if (rs.next()) {
                    String name2=rs.getString("NAME");
                    String phone2=rs.getString("PHONE");
                    String email2=rs.getString("EMAIL");
                    String time = rs.getString("TIME");
                    String seat = rs.getString("SEAT");
                    int money = rs.getInt("PAY");
                    String password =rs.getString("password");
                    
                    info = new Info(name2, phone2, email2, time, seat, money,password);
    
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
      
                e.printStackTrace();
            }
   
        }
        
        return info;
    }
    
    
        
        //delete메서드 - db에 저장된 정보들 중 입력받은 password와 일치하면 삭제시키는 메서드
        public static final String DELETE_INFO = 
            "delete from Info where PASSWORD = ? ";
        
        public int delete(String password) {
            
            int result =0;
            
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                stmt = conn.prepareStatement(DELETE_INFO);
                stmt.setString(1, password);
                rs = stmt.executeQuery();
                
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
       
            }
            
            return result;
        }
    
        
        
        //TimeSeat메서드 - 콤보박스 선택시 해당하는 시간에 일치한다면 db에서 시간일치한 정보를 호출하는 메서드
    public static final String TIME_FIND = 
            "select * from Info where TIME = ? ";
    
    public List<Info> TimeSeat(String time) {
        List<Info> result = new ArrayList<>();
 
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.prepareStatement(TIME_FIND);
            stmt.setString(1, time);
            rs = stmt.executeQuery();
            while (rs.next()) {
                    String name = rs.getString("NAME");
                    String phone = rs.getString("PHONE");
                    String email= rs.getString("PHONE");
                    String seat =rs.getString("SEAT");
                    int money = rs.getInt("PAY");
                    String password=rs.getString("PASSWORD");
                    
                    Info info = new Info(name, phone, email, time, seat, money,password);
                    
                    result.add(info);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
   
        }
        
        return result;
    }
}
