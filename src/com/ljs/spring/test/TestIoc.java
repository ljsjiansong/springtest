package com.ljs.spring.test;

import com.ljs.spring.User;
import com.ljs.spring.bean.Bean;
import com.ljs.spring.bean.Bean2;
import com.ljs.spring.inject.PropertyDemo1;
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
}

