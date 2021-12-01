package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 20:19
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class StructureTest {
    String brand;
    int price;

    //有参构造
    public StructureTest(String brand, int price){
        //就近原则
        //同名的变量，this关键字--代表本类
        this.brand = brand;
        this.price = price;
    }

    public StructureTest(){

    }


    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }
}
