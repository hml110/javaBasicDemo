package com.hml.clone;


/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 9:16
 */
public class User implements Cloneable {
    private String name;
    private Address address;//对象类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        //需要注意的是，super.clone()其实是浅拷贝，
        //所以在重写User类的clone()方法时，address对象需要调用address.clone()重新赋值。
        user.setAddress((Address) this.address.clone());
        return user;
    }


}
