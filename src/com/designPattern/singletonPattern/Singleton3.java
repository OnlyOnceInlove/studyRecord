package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式 最简单的单例模式
 * 懒汉模式 线程安全
 *
 * 优点:第一次调用才初始化,避免内存浪费
 * 缺点:必须加锁synchronized才能保证单例,但是加锁会影响修效率
 * 这种方式具备良好的lazy loading,能够在多线程中很好的工作,但是效率很低,99%的情况下不需要同步
 * @date 2020/5/25
 */
public class Singleton3 {
    //
    private static Singleton3 instance;
    //创建私有化构造方法 该类就不能被实例化
    private Singleton3() {
    }
    //获取唯一可用的对象
    public static synchronized Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void show(){
        System.out.println("hello world!");
    }
}
