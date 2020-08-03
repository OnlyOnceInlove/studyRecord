package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * 饿汉模式 线程安全
 *
 * 这种方式比较常用,但是容易产生垃圾对象;
 * 优点:没有加锁,执行效率会提高
 * 缺点:类加载时就进行初始化,浪费内存;
 * 它基于classloader机制避免了多线程的同步问题,不过,instance在类装载时就实例化,虽然导致类装载的原因有很多种,
 * 在单例模式中大多数都是调用getInstance方法,但是也不能确定有其他的方式(或者其他的静态方法)导致类装载,这时候初始化instance,
 * 显然没有达到lazy loading的效果
 * @date 2020/5/25
 */
public class Singleton4 {
    //
    private static Singleton4 instance = new Singleton4();
    //创建私有化构造方法 该类就不能被实例化
    private Singleton4() {
    }
    //获取唯一可用的对象
    public static  Singleton4 getInstance(){
        return instance;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
