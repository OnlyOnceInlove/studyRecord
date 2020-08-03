package com.spring.bean;

/**
 * @author majie
 * @description
 * @date 2020/7/10
 */
public class User2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String HelloSay(){
        System.out.println("hello"+name);
        return "true";
    }
}
