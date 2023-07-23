package main.java.com.example.htlm3.entity;
public class Comment {
    public int id;
    public String username;
    public String message;
    public Comment(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Comment(int id, String username, String message) {
        this.id = id;
        this.username = username;
        this.message = message;
    }

    // 省略getter和setter方法
}