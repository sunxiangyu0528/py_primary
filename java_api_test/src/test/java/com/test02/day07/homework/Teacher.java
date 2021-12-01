package com.test02.day07.homework;

public class Teacher {

    // 1、定义老师类Teacher，私有属性：name，age，提供空参有参构造，提供get/set方法。
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String toString(){
        return "name："+name+",age:"+age;
    }


}
