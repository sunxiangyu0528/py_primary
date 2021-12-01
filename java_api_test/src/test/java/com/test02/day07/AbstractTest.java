package com.test02.day07;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 20:15
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public abstract class AbstractTest {
    //抽象方法不能有方法体
    public abstract void print();
    //抽象类里面允许有普通的方法吗？？
    public  void play(){
        System.out.println("play...");
    }

    /*public static void main(String[] args) {
        //static修饰的成员变量，它是不依附于对象的
        //类名.成员变量名
        //StaticTest staticTest = new StaticTest();
        //工具方法，操作文件/获取日期
        //StaticTest.printDemo();

        //final
        FinalTest finalTest = new FinalTest();
        finalTest.price=4000;
        //finalTest.brand="华为";
    }*/


}
