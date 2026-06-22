package com.mru.controller;

public class Contact {
    
    String name;
    String email;
    String msg;

    public Contact() {
    }

    public Contact(String name, String email, String msg) {
        this.name = name;
        this.email = email;
        this.msg = msg;
    }

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    

}
