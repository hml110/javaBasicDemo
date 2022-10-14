package com.hml.clone;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 11:02
 */
public class UserByJackson {
    private String name;
    private AddressByJackson address;//对象类型

    public UserByJackson(String name, AddressByJackson address) {
        this.name = name;
        this.address = address;
    }

    public UserByJackson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressByJackson getAddress() {
        return address;
    }

    public void setAddress(AddressByJackson address) {
        this.address = address;
    }
}
