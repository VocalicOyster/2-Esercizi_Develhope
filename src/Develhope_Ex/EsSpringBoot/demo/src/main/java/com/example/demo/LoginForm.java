package com.example.demo;

public class LoginForm {

    public LoginForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
