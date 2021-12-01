package com.test02.day04;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/29 21:46
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Phone {
    //属性
    public String brand = "华为";
    int price = 4000;
    String color = "黑色";
    /*
    打电话的行为
     */
    public void call() {
        System.out.println("打电话");
    }
    /*
    发短信的行为
    */
    public void sendMessage() {
        System.out.println("发短信");
    }
}
