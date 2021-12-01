package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 21:46
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Phone {
    public String brand;
    protected int price;

    public Phone(){
        System.out.println("这是父类的无参构造方法");
    }

    public Phone(String brand, int price){
        System.out.println("这是父类的有参构造方法");
    }


    public  void call(){
        System.out.println("用2G打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
