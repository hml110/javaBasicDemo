package com.hml.clone;

import java.io.Serializable;

/**
 * @author hml
 * @version 1.0
 * @description: 都实现Serializable接口
 * @date 2022/10/14 10:06
 */
public class AddressBySerializable implements Serializable {
    private String city;
    private String country;

    public AddressBySerializable(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
