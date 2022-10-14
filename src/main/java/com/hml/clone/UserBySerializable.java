package com.hml.clone;

import java.io.Serializable;

/**
 * @author hml
 * @version 1.0
 * @description: 都实现Serializable接口
 * @date 2022/10/14 10:07
 */
public class UserBySerializable implements Serializable {
    private String name;
    private AddressBySerializable address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBySerializable getAddress() {
        return address;
    }

    public void setAddress(AddressBySerializable address) {
        this.address = address;
    }

    public UserBySerializable(String name, AddressBySerializable address) {
        this.name = name;
        this.address = address;
    }
}
