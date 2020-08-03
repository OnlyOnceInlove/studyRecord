package com.proxy;

import com.proxy.su.IUserDao;
import com.proxy.su.UserDao;

/**
 * @author majie
 * @description  测试类
 * @date 2020/7/30
 */
public class App {

    //静态代理
   /* public static void main(String[] args) {
        //目标对象
        IUserDao userDao = new IUserDao();

        //代理对象,把目标对象传递给代理对象,建立代理关系
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);

        //执行的是代理方法
        userDaoProxy.save();

    }*/

   //动态代理  jdk
    /*public static void main(String[] args) {
        //目标对象
        IUserDao target = new IUserDao();
        //原始的类型
        System.out.println(target.getClass());

        //给目标对象,创建代理对象
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        //内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        proxy.save();
    }*/


    //动态代理  cglib
    public static void main(String[] args) {
        //目标对象
        IUserDao target = new IUserDao();

        //代理对象
        IUserDao Iuserdao = (IUserDao) new CglibProxy(target).getProxyInstance();

        //执行代理对象的方法
        Iuserdao.save();
    }
}
