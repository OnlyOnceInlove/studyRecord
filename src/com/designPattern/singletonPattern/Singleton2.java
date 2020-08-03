package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * 懒汉模式 线程不安全
 *
 * 这种方式是最基本的实现方式,这种实现最大的问题就是不支持多线程.
 * 因为没有加锁synchronized,所以严格意义上他算不上单例模式
 * 这种方式lazy loading 很明显,不要求线程安全,在多线程不能正常工作
 * @date 2020/5/25
 */
public class Singleton2 {
    //
    private static Singleton2 instance;
    //创建私有化构造方法 该类就不能被实例化
    private Singleton2() {
    }
    //获取唯一可用的对象
    public static Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
