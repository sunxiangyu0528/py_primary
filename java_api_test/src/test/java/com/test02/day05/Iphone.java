package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 21:44
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Iphone extends Phone{

    public Iphone(){
        this("苹果",3000);
    }

    public Iphone(String brand,int price){
        System.out.println("Iphone类的有参构造");
    }

    public void call(){
        //调用父类的call方法
        sendMessage();
        System.out.println(super.brand);
        System.out.println("用4G打电话");
    }
}
