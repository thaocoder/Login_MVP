package com.example.login_mvp.model;

public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswork() {
        return password;
    }

    public void setPasswork(String password) {
        this.password = password;
    }
}
