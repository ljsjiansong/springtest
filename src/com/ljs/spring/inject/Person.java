package com.ljs.spring.inject;

public class Person {
    private String pName;

    public void setpName(String pName) {
        this.pName = pName;
    }
    public void test1(){
        System.out.println("pName:"+pName);
    }
}
