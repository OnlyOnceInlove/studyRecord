package com.proxy;

import com.proxy.su.UserDao;

/**
 * @author majie
 * @description  代理处理,静态代理
 * 静态代理总结:
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展
 * 2.缺点:
 * 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多,同时,
 * 一旦接口对象增加方法,目标对象与代理对象都需要维护
 * 动态代理可以解决此缺点
 * @date 2020/7/30
 */
public class UserDaoProxy implements UserDao {

    //接收保存目标对象
    private UserDao target;

    public UserDaoProxy(UserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("开始事务...");
        target.save();
        System.out.println("事务结束...");
    }
}
