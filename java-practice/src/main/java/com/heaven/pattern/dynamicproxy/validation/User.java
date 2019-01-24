package com.heaven.pattern.dynamicproxy.validation;

/**
 * Simple User interface which exposes username and password properties.
 */
public interface User {


    String getUsername();


    void setUsername(String username) throws ValidationException;


    String getPassword();


    void setPassword(String password) throws ValidationException;
}
