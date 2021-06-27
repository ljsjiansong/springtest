package com.ljs.spring.anotations;

import org.springframework.stereotype.Component;

@Component(value = "userDaos") // 这里的value值可以随便写。因为@autoWried已经根据类名注入
public class UserDao {
    public void add(){
        System.out.println("dao  add .....");
    }
}
