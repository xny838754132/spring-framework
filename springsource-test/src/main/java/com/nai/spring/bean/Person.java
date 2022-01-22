package com.nai.spring.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    // @Autowired
    private Cat cat;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Lookup // 去容器中找 @Bean的方式注册的Person @Lookup不生效
    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}