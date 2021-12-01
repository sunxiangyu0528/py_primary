package com.test02.day07.homework;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

//  2、创建老师对象t1，name：张三，age：25
//	3、创建老师对象t2，name：李四，age：35
//	4、创建老师对象t3，name：老王，age：19
//	5、创建老师对象t3，name：赵六，age：29
        Teacher t1 = new Teacher("张三", 25);
        Teacher t2 = new Teacher("李四", 35);
        Teacher t3 = new Teacher("老王", 19);
        Teacher t4 = new Teacher("赵六", 29);
//	6、创建ArrayList集合对象存储t1，t2，t3，t4
        ArrayList<Teacher> arraylist = new ArrayList<Teacher>();
        arraylist.add(t1);
        arraylist.add(t2);
        arraylist.add(t3);
        arraylist.add(t4);
//	7、删除第三个老师对象。
        arraylist.remove(2);
        System.out.println("7.删除第三个老师对象:" + arraylist);
//	8、取出第一个老师对象，将姓名name改为张龙。
        arraylist.get(0).setName("张龙");
        //自动的调用toString方法
        System.out.println("8.取出第一个老师对象，将姓名name改为张龙:" + arraylist);
//9、通过普通for循环和增强for循环打印所有学生数据。打印出对应的name和age属性。
        System.out.println("9.通过普通for循环和增强for循环打印所有学生数据。打印出对应的name和age属性");
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i).getName());
            System.out.println(arraylist.get(i).getAge());
        }
        for (Teacher teacher : arraylist) {
            System.out.println(teacher.getName());
            System.out.println(teacher.getAge());
        }
//10、请求出集合中的老师平均年龄。
        //存储老师的数量
        int count = 0;
        int sum = 0;
        for (Teacher teacher : arraylist) {
            sum += teacher.getAge();
            count++;
        }
        double result = sum / count;
        System.out.println("10.求出集合中的老师平均年龄:" + result);
    }
}