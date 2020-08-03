package com.clone;


import java.io.*;

/**
 * @author majie
 * @description
 *基于序列化 和反序列化实现的可空不仅仅是深度克隆,更重要的是通过泛型限定,可以检查出
 *要克隆的对象是否支持序列化,这项检查是编译器完成的,不是在运行时抛出异常,这种是方案
 * 明显优于使用Object类的clone方法克隆对象.让问题在编译的时候暴露出来总是好过把问题
 * 留到运行时
 *
 * @date 2020/7/31
 */
public class MyUtil {

    public MyUtil() {
        throw new AssertionError();
    }

    public static <T extends Serializable> T clone(T obj) throws Exception{
       ByteArrayOutputStream bout = new ByteArrayOutputStream();
       ObjectOutputStream oos = new ObjectOutputStream(bout);
       oos.writeObject(obj);

       ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
       ObjectInputStream ois = new ObjectInputStream(bin);
       return (T) ois.readObject();
   }
}
