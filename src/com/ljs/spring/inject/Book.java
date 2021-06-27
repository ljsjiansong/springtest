package com.ljs.spring.inject;

public class Book {
    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void bookdemo(){
        System.out.println("使用set方法注入的bookName是"+bookName);
    }
}
