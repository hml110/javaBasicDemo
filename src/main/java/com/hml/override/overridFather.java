package com.hml.override;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:28
 */
public class overridFather {
    public void method1() {
        System.out.println("我是父类普通方法");
    }

    private void method2() {
        System.out.println("我是父类私有方法");
    }

    public static void method3(int a) {
        System.out.println("我是父类static方法" + a);
    }

    public final void method4(int a) {
        System.out.println("我是父类final方法" + a);
    }


}
