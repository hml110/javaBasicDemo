package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:29
 */
public class Son2 extends Father {
    //注意：
    //
    //· 如果访问的成员变量子类中有，则优先访问子类本身的
    //
    //· 如果访问的成员变量子类中无，父类中有，则访问继承下来的
    //
    //· 如果子类与父类中有同名的成员变量，则优先访问子类自己的，即子类将父类的同名变量隐藏
    //
    //成员变量的访问遵循就近原则，自己有就优先访问自己的



    int a;//与父类同名，相同类型
    String b;//与父类同名，不同类型

    int c;
    public void get() {
        //从父类继承
        a = 10;
        b = "200"; //访问自己
        c = 20;
    }

    @Override
    public String toString() {
        return "Son{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Son2 son = new Son2();
        son.get();
        System.out.println(son);
    }
}
