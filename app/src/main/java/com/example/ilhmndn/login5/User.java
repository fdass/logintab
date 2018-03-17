package com.example.ilhmndn.login5;

/**
 * Created by FREDERIK on 3/4/2018.
 */

public class User {

    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
