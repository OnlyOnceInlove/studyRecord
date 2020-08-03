package com.spring;

import com.spring.bean.User;
import com.spring.bean.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author majie
 * @description
 * @date 2020/7/10
 */
public class Manage {
    public static void main(String[] args) {
//        User user = new User();
//        user.setName("sji");
//        user.HelloSay();


        //bean
        String path=System.getProperty("user.dir");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(path + "//src//com//spring//springConfig.xml");
        User user = (User) applicationContext.getBean("user");
        User2 user2 = (User2) applicationContext.getBean("user2");
        System.out.println(user.getName());
        System.out.println(user2.getName());
        user.HelloSay();
        user2.HelloSay();
        System.out.println(user.getUser2().HelloSay());
    }
}
