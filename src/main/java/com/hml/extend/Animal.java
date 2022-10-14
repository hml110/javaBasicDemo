package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description: java继承实例
 * @date 2022/10/13 13:56
 */
public class Animal {
    String name;
    String gender;
    int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "吃东西");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");
    }
}
