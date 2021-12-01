package com.test02.day06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/8 20:44
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class PhoneTest {
    public static void main(String[] args) {
        //用父类类型来接收子类的对象
        //继承父类，复写对应的方法
       // Phone huawei2 = new Huawei();
       //Phone iphone2 = new Iphone();
        //Huawei huawei = new Huawei();
        //useCall(huawei2);
        //Iphone iphone = new Iphone();
        //useCall(iphone2);

    }

    public static void useCall(Phone phone) {//Phone phone = new Huawei();
        //1、插sim卡
        System.out.println("插入sim卡");
        //2、手机开机
        System.out.println("手机开机");
        //强制转换  将父类类型转换成子类类型
        Iphone iphone = (Iphone)phone;
        iphone.siri();
    }

   /* public static void useHuaweiCall(Huawei huawei){ //Huawei huawei = new Huawei
        //1、插sim卡
        System.out.println("插入sim卡");
        //2、手机开机
        System.out.println("手机开机");
        huawei.call();
    }
    public static void useIphoneCall(Iphone iphone){
        //1、插sim卡
        System.out.println("插入sim卡");
        //2、手机开机
        System.out.println("手机开机");
        iphone.call();
    }*/

}
