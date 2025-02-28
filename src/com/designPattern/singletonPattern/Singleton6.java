package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * 登记式/静态内部类
 *
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，
 * 应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
 * @date 2020/5/25
 */
public class Singleton6 {
    private static class SingletonHolder{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6(){}

    public static final Singleton6 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
