package com.test02.day05.homework;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/8 20:10
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Student {
    private String name;
    private int age;
    private int score;

    public Student(){

    }

    public Student(String name,int age, int score){
        this.name=name;
        if(age <=15){
            System.out.println("年龄不符合");
            this.age=15;
            return;
        }
        this.age=age;
        this.score=score;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age <=15){
            System.out.println("年龄不符合");
            this.age=15;
            return;
        }
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }

    public int getScore(){
        return this.score;
    }

    public void show(){
        System.out.println("姓名："+name+"年龄："+age+"分数："+score);
    }
}
