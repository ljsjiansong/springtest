package com.ljs.spring.anotations;

import javax.annotation.Resource;

public class BookService {
    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;

    public void add(){
        System.out.println("book service");
        bookDao.book();
        ordersDao.buy();
    }
}
