package com.hml.clone;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 11:03
 */
public class AddressByJackson {
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

    public AddressByJackson() {
    }

    public AddressByJackson(String city, String country) {
        this.city = city;
        this.country = country;
    }
}
