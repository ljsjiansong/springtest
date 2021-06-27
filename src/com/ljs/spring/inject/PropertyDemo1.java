package com.ljs.spring.inject;

public class PropertyDemo1 {
    private String userName;

    public PropertyDemo1(String userName) {
        this.userName = userName;
    }

    public void test1(){
        System.out.println("demo 使用有参构造注入属性"+userName);
    }
}
