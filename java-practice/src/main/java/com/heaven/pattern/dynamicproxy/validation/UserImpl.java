package com.heaven.pattern.dynamicproxy.validation;

/**
 * Implementation of the User interface.
 */
public class UserImpl implements User {


    private String username = null;

    private String password = null;


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

    public String toString() {
        return "username: " + username + ", password: " + password;
    }
}
