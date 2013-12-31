package com.jony;

import java.util.Calendar;

public abstract class Person {
    Address address = new Address();
    private String name;
    private long cpf; // Social Security or National Insurance Number
    private char sex;
    private Calendar birth = Calendar.getInstance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
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
