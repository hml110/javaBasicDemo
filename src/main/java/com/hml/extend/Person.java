package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description: 没有继承关系时的执行顺序
 * @date 2022/10/13 15:17
 */
public class Person {
    String name;
    String gender;
    int age;
    public Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("我是Person构造方法");
    }
    {
        System.out.println("我是Person实例代码块");
    }
    static {
        System.out.println("我是Person静态代码块");
    }

    public static void main(String[] args) {
        Person p1 = new Person("xiaoHua","男",12);
        //我是静态代码块
        //我是实例代码块
        //我是构造方法
        System.out.println("=====================");
        Person p2 = new Person("xiaoHong","女",15);
        //我是实例代码块
        //我是构造方法
    }

    //静态代码块先执行，且只执行一次，在类加载阶段执行
    //当有对象创建时，才会执行实例代码块，实例代码块执行完后，再执行构造方法
}
