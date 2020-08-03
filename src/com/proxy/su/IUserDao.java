package com.proxy.su;

/**
 * @author majie
 * @description
 * @date 2020/7/30
 */
public class IUserDao implements UserDao {

    @Override
    public void save() {
        System.out.println("数据保存中");
    }
}
