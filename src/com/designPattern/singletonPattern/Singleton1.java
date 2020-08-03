package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * @date 2020/5/25
 */
public class Singleton1 {
    //创建自己的 对象
    private static Singleton1 instance = new Singleton1();
    //创建私有化构造方法 该类就不能被实例化
    private Singleton1() {
    }
    //获取唯一可用的对象
    public static Singleton1 getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
