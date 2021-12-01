package com.test02.day05.homework;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/8 20:22
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class StudentTest {
    public static void main(String[] args) {
        //1、使用有参构造初始化
        //Student student = new Student("tom",13,80);
       // student.show();
        //2、调用setAge赋值
        Student student = new Student();
        student.setName("tom");
        student.setAge(13);
        student.show();
    }
}
