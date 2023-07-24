package com.example.htlm3;

public class Comment {
    private String name;
    private String message;

    public Comment(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}