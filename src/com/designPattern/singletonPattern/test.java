package com.designPattern.singletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author majie
 * @description
 * @date 2020/5/25
 */
public class test {
    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        singleton1.show();

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.show();

        Singleton3 singleton3 = Singleton3.getInstance();
        singleton3.show();

        Singleton4 singleton4 = Singleton4.getInstance();
        singleton4.show();

        Singleton5 singleton5 = Singleton5.getInstance();
        singleton5.show();

        Singleton6 singleton6 = Singleton6.getInstance();
        singleton6.show();

        List<Object> list = new ArrayList<>();
    }
}
