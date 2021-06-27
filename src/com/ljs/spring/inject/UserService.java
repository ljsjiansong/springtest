package com.ljs.spring.inject;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void userServiceTest(){
        System.out.println("service.....");
        userDao.userDaoTest();
    }
}
