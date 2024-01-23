package com.itwill.view;

// 한사람 마다 가지고 있는 정보 
public class Info {
    private String name;
    private String phone;
    private String email;
    private String time;
    private String seat;
    private int money;
    private String password;
    

    public Info(String name, String phone, String email, String time, String seat, int money, String password) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.time = time;
        this.seat = seat;
        this.money = money;
        this.password = password;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public String getPassword() {
        return password;
    }

  


    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "Info [name=" + name + ", phone=" + phone + ", email=" + email + ", time=" + time + ", seat=" + seat
                + ", money=" + money + ", password=" + password + "]";
    }
    


    
    
}
