package com.jwt_auth.models.binding_models;

public class LoginUser {

    private String username;
    private String password;

    public LoginUser() {
        super();
    }

    public LoginUser(String user, String password) {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
