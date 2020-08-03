package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * 双检锁/双重检验锁(DCL,即double_checked locking)
 *
 * 这种方式采用双锁机制,安全且在多线程情况下能保持高性能.
 * getInstance()的性能对应用程序很关键
 * @date 2020/5/25
 */
public class Singleton5 {
    //
    private static Singleton5 instance;
    //创建私有化构造方法 该类就不能被实例化
    private Singleton5() {
    }
    //获取唯一可用的对象
    public static Singleton5 getInstance(){
        if (instance == null) {
            synchronized (instance){
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
