package com.example.firecrud;

public class User {
    String key;
    String name;
    int age;

    User(String key, String name, int age){
        this.key = key;
        this.name=name;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
