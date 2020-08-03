package com.annotation;

/**
 * @author majie
 * @description
 * @date 2020/7/14
 */
public class Test {
    @CherryAnnotation(name = "cherry-peng",age = 23,score = {99,66,77})
    public void study(int times){
        for (int i = 0; i < times ; i++) {
            System.out.println("CAOOD");
        }
    }
}
