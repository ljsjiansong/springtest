package com.ljs.spring;

import com.ljs.spring.bean.Bean2;

public class PersonFactory {
    public static Bean2 getPerson(){
        return new Bean2();
    }
}
