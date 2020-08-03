package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author majie
 * @description  动态代理
 * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 *
 * 特点:
 * 代理对象不需要实现接口
 * 代理对象的生成是利用jdk的api,动态的在内存中构建代理对象(需要我们指定创建)
 * 代理对象/目标对象实现的接口的类型)
 * 动态代理也叫作jdk代理,接口代理
 *
 *
 * @date 2020/7/30
 */
public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("结束事务2");
                        return returnValue;
                    }
                }
        );
    }
}
