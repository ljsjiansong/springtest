package com.ljs.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {
    @Before(value = "execution(* com.ljs.spring.aop.Book.*(..))")
    public void before1(){
        System.out.println("before1....");
    }
}
