package com.test02.day05.homework;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/8 20:34
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Tester tester= new Tester();
        Coder coder = new Coder();
        Manager manager = new Manager();
        tester.work();
        tester.sleep();
        coder.work();
        coder.sleep();
        manager.work();
        manager.sleep();

        //System.out.println(tester.name);
        //System.out.println(tester.age);
        //tester.play();
    }
}
