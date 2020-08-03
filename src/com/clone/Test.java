package com.clone;

import com.clone.entiy.Car;
import com.clone.entiy.Person;

/**
 * @author majie
 * @description
 * @date 2020/7/31
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Person person = new Person("李四", 33, new Car("Benz", 300));
        Person op2 = MyUtil.clone(person);
        op2.getCar().setBrand("BYD");

        System.out.println(person);
        System.out.println(op2);

        Person person1 = (Person) person.clone();
        Person person2 = (Person) person.clone1();
        person1.setAge(100);
        System.out.println("--------------------------------");
        System.out.println(person1);
        System.out.println("浅person1==car"+person1.getCar());
        System.out.println(person2);
        System.out.println("深person2==car"+person2.getCar());
        System.out.println(person);
        System.out.println("person==car"+person.getCar());
        System.out.println(op2);
        System.out.println("流式==car"+op2.getCar());

    }
}
