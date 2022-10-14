package com.hml.extend;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 14:59
 */
public class sonConstruct extends fatherConstruct {

    public sonConstruct() {
        super();
    }

    public static void main(String[] args) {
        //构造子类对象时，先执行基类的构造方法，然后执行子类的构造方法
        sonConstruct sc = new sonConstruct();
    }
}


