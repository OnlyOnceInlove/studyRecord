package com.stream;

/**
 * @author majie
 * @description
 * @date 2020/7/2
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Stream（流）是一个来自数据源的元素队列并支持聚合操作
 *
 * 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算。
 * 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
 * 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。
 * 和以前的Collection操作不同， Stream操作还有两个基础的特征：
 *
 * Pipelining: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）。 这样做可以对操作进行优化， 比如延迟执行(laziness)和短路( short-circuiting)。
 * 内部迭代： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。 Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现。
 */
public class ListStream {

    //循环 迭代
    /*public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        strings.stream().forEach(o -> {
            System.out.println(o);
        });
    }*/

    //统计
   /* public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics sta = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("集合中最大的数" + sta.getMax());
        System.out.println("集合中最小的数" + sta.getMin());
        System.out.println("所有数之和" + sta.getSum());
        System.out.println("??????" + sta.getCount());
        System.out.println("平均数" + sta.getAverage());
    }*/

   //过滤
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(string -> string.isEmpty()).count();

        System.out.println(count);

    }
}
