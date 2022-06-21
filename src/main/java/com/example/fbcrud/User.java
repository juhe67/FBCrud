package com.example.fbcrud;

public class User {
    String key;
    String name;
    String status;
    int age;

    public User(String key, String name, String status, int age) {
        this.key = key;
        this.name = name;
        this.status = status;
        this.age = age;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }





}
