package com.ljs.spring.anotations;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource(name = "userDaos")
    // 如果不指定name属性，则正确。如指定的与userDao的@Component(value)值不一致。则报错
    private UserDao userDao;

    public void add(){
        System.out.println("userService .....");
        userDao.add();
    }
}
