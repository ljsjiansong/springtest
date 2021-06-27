package com.ljs.spring.test;

import com.ljs.spring.User;
import com.ljs.spring.bean.Bean;
import com.ljs.spring.bean.Bean2;
import com.ljs.spring.inject.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    @Test
    public void getUserName(){
        // 1、加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User)context.getBean("user");
        User user2 = (User)context.getBean("user");
        System.out.println(user);
        System.out.println(user2);
        user.add("name");
    }
    // 测试静态工厂创建实例
    @Test
    public void getStaticFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
        Bean2 bean = (Bean2)context.getBean("person");
        System.out.println(bean);
        bean.add("name");
    }

    // 测试实例化工厂
    @Test
    public void getFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Bean bean = (Bean)context.getBean("bean");
        System.out.println(bean);
        bean.add("name");
    }

    // 测试有参构造注入属性
    @Test
    public void getConstrctor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo1.xml");
        PropertyDemo1 propertyDemo1 = (PropertyDemo1)context.getBean("demo1");
        propertyDemo1.test1();
    }

    // 测试set注入属性
    @Test
    public void getSet(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo2.xml");
        Book book = (Book)context.getBean("demo2");
        book.bookdemo();
    }

    // 测试对象注入属性
    @Test
    public void getTestObject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("demo3.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.userServiceTest();
    }

    // 测试p命名空间注入属性
    @Test
    public void getP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Person person = (Person) context.getBean("person");
        person.test1();
    }

    // 测试复杂属性注入
    @Test
    public void notSimple(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
        Person2 person = (Person2) context.getBean("person");
        person.test();
    }

    // 测试注解
    @Test
    public void testAnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("anotations.xml");
        com.ljs.spring.anotations.User user = (com.ljs.spring.anotations.User) context.getBean("user");
        user.add();
    }
}

