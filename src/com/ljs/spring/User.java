package com.ljs.spring;

public class User {
    public void add(String name){
        System.out.println("add......");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add("name");
    }
}
