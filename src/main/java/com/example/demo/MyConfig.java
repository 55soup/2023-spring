package com.example.demo;

import org.springframework.context.annotation.Bean;
public class MyConfig {
    //bean 등록하기
    @Bean
    public MyBean helloMyBean(){
        return new MyBean();
    }

    @Bean
    public Person helloMyPerson(){
        Person p = new Person("John", 20);
        p.setsomething("something");
        return p;
    }
}
