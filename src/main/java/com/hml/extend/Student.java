package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description: 有继承关系的执行顺序
 * @date 2022/10/13 15:23
 */

public class Student extends Person{
    public Student(String name, String gender, int age) {
        super(name, gender, age);
        System.out.println("student的构造方法");
    }
    {
        System.out.println("student的实例代码块");
    }
    static {
        System.out.println("student的静态代码块");
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三","男",35);
        //我是Person静态代码块
        //student的静态代码块
        //我是Person实例代码块
        //我是Person构造方法
        //student的实例代码块
        //student的构造方法
        System.out.println("=====================");
        Student s2 = new Student("李四","男",30);
        //我是Person实例代码块
        //我是Person构造方法
        //student的实例代码块
        //student的构造方法
    }
}

