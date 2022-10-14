package com.hml.override;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 15:34
 */
public class overrideDemo extends overridFather {
  //重写
    @Override
    public void method1() {
//        super.method1();
        super.method4(20);
    }



    public static void main(String[] args) {
        overrideDemo od = new overrideDemo();
        od.method1();

    }
}
