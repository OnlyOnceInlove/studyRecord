package com.clone.entiy;

import java.io.Serializable;

/**
 * @author majie
 * @description
 * @date 2020/7/31
 */
public class Person implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

   /* @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
    }
*/
    public Object clone() throws CloneNotSupportedException{
        Person person = (Person) super.clone();
        return person;
    }

    public Object clone1() throws CloneNotSupportedException{
        Person person = (Person) super.clone();
        person.setCar((Car) person.getCar().clone());
        return person;
    }


}
