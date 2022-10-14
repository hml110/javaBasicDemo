package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:28
 */
public class Father {
    //父类的变量
    int a = 100;
    int b = 100;

    public void method1() {
        System.out.println("我是父类方法");
    }

    public void method2() {
        System.out.println("我是父类方法");
    }

    public void method3(int a) {
        System.out.println("我是父类方法" + a);
    }

    public static void method4(int x) {
        System.out.println("我是父类静态方法" + x);
    }

}
