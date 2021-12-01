package com.test02.day04;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/29 21:50
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class PhoneTest {
    public static void main(String[] args) {
        //1、实例化phone对象
        // 类名 对象名 = new 类名();
        Phone p = new Phone();
        //1、声明
        Phone p2 = null;
        //2、实例化
        p2 = new Phone();
        //调用对象的方法
        p.call();
        p.brand="苹果";
        System.out.println(p.brand);
    }
}
