package com.jony.model;

import com.jony.model.Address;

import java.util.Calendar;
/**
 * Abstract class representing the information about all users
 *
 * @author Jonatas Dourado
 * @version 0.1
 */
public abstract class Person {
    private String name;
    private String cpf; // Social Security or National Insurance Number
    private char sex;
    private Calendar birth = Calendar.getInstance();
    private Address address = new Address();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Calendar getBirth() {
        return birth;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street, String number, String complement, String district, String city, String zipcode) {
        this.address.setStreet(street);
        this.address.setNumber(number);
        this.address.setComplement(complement);
        this.address.setDistrict(district);
        this.address.setCity(city);
        this.address.setZipcode(zipcode);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                ", address=" + address +
                '}';
    }
}
