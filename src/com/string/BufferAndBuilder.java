package com.string;

/**
 * @author majie
 * @description
 * @date 2020/7/27
 */
public class BufferAndBuilder {

    public static void main(String[] args) {
        //buffer字符串反转
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        System.out.println(stringBuffer.reverse());
        //builder字符串反转
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd");
        System.out.println(stringBuilder.reverse());
    }
}
