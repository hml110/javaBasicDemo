package com.hml.clone;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/13 15:57
 */
public class Address implements Cloneable {
    private String city;
    private String country;

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

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    //重写clone()方法，使其支持深拷贝。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }
}
