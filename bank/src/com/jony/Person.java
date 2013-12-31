package com.jony;

import java.util.Calendar;

public class Person {
    Address address = new Address();
    private String name;
    private String password;
    private String cpf; // Social Security or National Insurance Number
    private char sex;
    private Calendar birth = Calendar.getInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
