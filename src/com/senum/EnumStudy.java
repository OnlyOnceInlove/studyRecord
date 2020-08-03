package com.senum;

/**
 * @author majie
 * @description
 * 单个枚举类
 * @date 2020/7/2
 */
public enum EnumStudy {
    SPRING,SUMMER,AUTUMN,WINTER;



    public static void main(String[] args) {
        for (EnumStudy s : EnumStudy.values()) {
            System.out.println(s);
        }
        System.out.println(EnumStudy.valueOf("SPRING"));
    }

}
