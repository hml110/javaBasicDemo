package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:01
 */
public class Dog extends Animal {
    public String color;

    public Dog(String name, String gender, int age, String color) {
        super(name, gender, age);
        this.color = color;
    }


    public void bite() {
        System.out.println(name+"叫喊");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", "男", 23, "红色");
        System.out.println(dog.name);
        System.out.println(dog.gender);
        System.out.println(dog.age);
        System.out.println(dog.color);
        //调用父类的方法
        dog.eat();
        dog.sleep();

        //调用字类的方法
        dog.bite();

        //子类将继承父类的成员变量和成员方法
        //子类继承父类之后，需要添加自己特有的成员，体现出与基类的不同


    }


}
