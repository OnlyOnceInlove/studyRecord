package com.spring.bean;

/**
 * @author majie
 * @description
 * @date 2020/7/10
 */
public class User {

    private String name;

    private User2 user2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    public String HelloSay(){
        System.out.println("hello"+name);
        return "true";
    }
}
