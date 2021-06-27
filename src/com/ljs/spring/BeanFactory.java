package com.ljs.spring;

import com.ljs.spring.bean.Bean;

public class BeanFactory {
    public Bean getBean(){
        return new Bean();
    }
}
