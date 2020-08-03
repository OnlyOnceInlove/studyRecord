package com.annotation;

import java.lang.annotation.*;

/**
 * 注解
 * 注解其实就是一种标记,可以在程序代码中的关键节点(类/方法/变量/参数/包)上打上这些标记,
 * 然后程序在编译时或运行时可以检测到这些标记从而执行一些特殊操作
 *
 * 第一步，定义注解——相当于定义标记；
 * 第二步，配置注解——把标记打在需要用到的程序代码中；
 * 第三步，解析注解——在编译期或运行时检测到标记，并进行特殊操作。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
@Documented
public @interface CherryAnnotation {

    /**
     * 注解类型元素
     * 访问修饰符必须为public，不写默认为public；
     * 该元素的类型只能是基本数据类型、String、Class、枚举类型、注解类型（体现了注解的嵌套效果）以及上述类型的一位数组；
     * 该元素的名称一般定义为名词，如果注解中只有一个元素，请把名字起为value（后面使用会带来便利操作）；
     * ()不是定义方法参数的地方，也不能在括号中定义任何参数，仅仅只是一个特殊的语法；
     * default代表默认值，值必须和第2点定义的类型一致；
     * 如果没有默认值，代表后续使用注解时必须给该类型元素赋值。
     */
    public String name();
    int age() default  18;
    int[] score();
}

/**
 * 元注解
 * 专门修饰注解的注解.
 * @Target 修饰注解 可在什么类型上使用
 *
 * @Retention
 * 如果一个注解被定义为RetentionPolicy.SOURCE，则它将被限定在Java源文件中，那么这个注解即不会参与编译也不会在运行期起任何作用，这个注解就和一个注释是一样的效果，只能被阅读Java文件的人看到；
 * 如果一个注解被定义为RetentionPolicy.CLASS，则它将被编译到Class文件中，那么编译器可以在编译时根据注解做一些处理动作，但是运行时JVM（Java虚拟机）会忽略它，我们在运行期也不能读取到；
 * 如果一个注解被定义为RetentionPolicy.RUNTIME，那么这个注解可以在运行期的加载阶段被加载到Class对象中。那么在程序运行阶段，我们可以通过反射得到这个注解，并通过判断是否有这个注解或这个注解中属性的值，从而执行不同的程序代码段。我们实际开发中的自定义注解几乎都是使用的RetentionPolicy.RUNTIME；
 * 在默认的情况下，自定义注解是使用的RetentionPolicy.CLASS。
 *
 * @Documented
 * 是被用来只指定自定义注解是否能随着被定义的java文件生成到JavaD欧辰文档当中.
 *
 * @Inherited
 * 是指某个自定义注解如果写在了父类的声明部分,那么子类的声明部分也能自动拥有该注解.@Inheritrd
 * 注解支队那些@Target被定义为ElementType.TYPE的自定义注解起作用.
 *
 */


/**
 * 注解使用方法一
 *
 */