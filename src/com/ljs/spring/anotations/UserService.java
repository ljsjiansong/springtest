package com.ljs.spring.anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    // 自动注入，根据类名称找到类对应的对象
    private UserDao userDao;

    public void add(){
        System.out.println("userService .....");
        userDao.add();
    }
}
