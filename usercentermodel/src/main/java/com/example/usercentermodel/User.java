package com.example.usercentermodel;

import com.xuesong.a8500.basemodule.router.bean.IUser;

public class User implements IUser {
    int age;
    String name;
    String email;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
