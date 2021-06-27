package com.ljs.spring.test;

import com.ljs.spring.User;
import com.ljs.spring.bean.Bean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    @Test
    public void getUserName(){
        // 1、加载spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
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
}

