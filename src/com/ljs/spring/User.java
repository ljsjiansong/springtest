package com.ljs.spring;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public User(){}

    public void add(String name){
        System.out.println("add......");
    }
}
