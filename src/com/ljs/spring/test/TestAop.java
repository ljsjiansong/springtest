package com.ljs.spring.test;

import com.ljs.spring.aop.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAop(){
        // 测试注解和配置混用
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }
}
