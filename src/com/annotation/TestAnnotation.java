package com.annotation;

import java.lang.reflect.Method;

/**
 * @author majie
 * @description
 * @date 2020/7/14
 */
public class TestAnnotation {
    public static void main(String[] args) {
        try{

            Class aClass = Class.forName("com.annotation.Test");
            Method study = aClass.getMethod("study", int.class);
            if(study.isAnnotationPresent(CherryAnnotation.class)){
                System.out.println("study类上配置了CherryAnnotation注解");
                //获取该元素上指定类型的注解
                CherryAnnotation annotation = study.getAnnotation(CherryAnnotation.class);
                System.out.println("name"+annotation.name() +",age"+annotation.age()+"," +
                        "score,"+annotation.score()[0]);
            }else{
                System.out.println("study类上没有配置cherryAnnotation注解");
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
