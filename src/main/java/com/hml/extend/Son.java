package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:29
 */
public class Son extends Father {
    int c;
    public void get() {
        //从父类继承
        a = 10;
        b = 20;
        //访问自己
        c = 30;
    }

    public void method1(int a){
        System.out.println("我是子类方法"+a);
    }
    public void method2(){
        System.out.println("我是子类方法");
    }
    public void method3(int a){
        System.out.println("我是子类方法"+a);
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
        Son son = new Son();
        son.get();
        //子类方法
        son.method1(10);
        //父类方法
        son.method1();
        //子类方法
        son.method2();
        //子类方法
        son.method3(3);

        System.out.println(son);

        //· 通过子类访问成员方法，先看子类本身有没有，如果有访问自己的，如果没有，访问父类的
        //
        //· 通过子类访问与父类同名方法时，如果子类和父类方法的参数列表不同则构成重载，根据调用方法传递的参数选择合适的方法访问
        //
        //· 如果子类和父类同名方法的原型一致，则只能访问到子类的

    }
}
