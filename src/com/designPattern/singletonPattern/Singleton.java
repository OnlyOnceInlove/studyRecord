package com.designPattern.singletonPattern;

/**
 * @author majie
 * @description 单例模式
 * @date 2020/5/25
 */
public class Singleton {
    //持有私有静态实例
    private static Singleton instance = null;

    //私有化的构造方法,防止创建实例
    private Singleton() {
    }

   /* public static *//*synchronized*//* Singleton getInstance(){
        if(instance == null ){
            synchronized (instance){
                if(instance == null){
                    instance = new Singleton();
                }
            }
            syncInit();
        }
        return instance;
    }*/

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new Singleton();
        }
    }

    /*private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }*/

    void show(){
        System.out.println("hellow world!!!");
    }

}
