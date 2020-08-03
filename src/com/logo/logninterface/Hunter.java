package com.logo.logninterface;

/**
 * 标识接口
 */
public class Hunter {
    public void fire(Object object) {
        //instanceof
        // 其中 obj 为一个对象，Class 表示一个类或者一个接口，当 obj 为 Class 的对象，或者是其直接或间接子类，或者是其接口的实现类，
        // 结果result 都返回 true，否则返回false。
        // 注意：编译器会检查 obj 是否能转换成右边的class类型，如果不能转换则直接报错，如果不能确定类型，则通过编译，具体看运行时定。
        if (object instanceof Person) {
            System.out.println("完蛋,杀人了");
        } else {
            System.out.println("反正不是人,吓死了");
        }
    }

    public void intelligentFire(Object object) {
        if (object instanceof Person) {
            return;
        }
        System.out.println("打一下" + object.getClass());
        System.out.println(object == null);
        object = null;
    }

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Object[] objects = new Object[]{new Dog(), new Japanese(), new Chinese(), new Moster()};
        for (int i = 0; i < objects.length; i++) {
            hunter.fire(objects[i]);
            hunter.intelligentFire(objects[i]);
        }
    }
}
