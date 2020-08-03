package com.clone.entiy;

import java.io.Serializable;

/**
 * @author majie
 * @description
 * @date 2020/7/31
 */
public class Car implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String brand;       // 品牌
    private int maxSpeed;       // 最高时速

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

   /* @Override
    public String toString() {
        return "Car [brand=" + brand + ", maxSpeed=" + maxSpeed + "]";
    }*/

    public Object clone() throws CloneNotSupportedException{
        Object clone = super.clone();
        return clone;
    }
}
