package main.java.com.example.htlm3.entity;

public class user {
    public String username;
    public String password;
    public int id ;
    public int number;

    public user(String username, String password, int id, int number) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.number = number;
    }
    public  user(){

    }

    public user(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
