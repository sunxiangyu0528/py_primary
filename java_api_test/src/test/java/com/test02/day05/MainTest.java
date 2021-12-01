package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 20:22
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        /*
        无参构造方法
        //创建对象
        StructureTest structureTest = new StructureTest();
        structureTest.brand="苹果";
        structureTest.price=3000;
        System.out.println(structureTest.brand);
        System.out.println(structureTest.price);*/
        //有参构造方法
        //1、创建对象
        //2、初始化对象的属性值
        /*StructureTest structureTest = new StructureTest();
        System.out.println(structureTest.brand);
        System.out.println(structureTest.price);*/

        //方法重载
        //OverloadTest overloadTest = new OverloadTest();
       // overloadTest.sum("py26",100);
       // overloadTest.sum(50,"hello");
        //System.out.println(overloadTest);

        //封装
       // EncapsulationTest encapsulationTest = new EncapsulationTest();
        //encapsulationTest.
        //encapsulationTest.setBrand("苹果");
        //System.out.println(encapsulationTest.getBrand());
       // encapsulationTest.setPrice(1000);
        //System.out.println(encapsulationTest.getPrice());
        //encapsulationTest.brand="苹果";
        //encapsulationTest.price=-1000;

        //继承
        /*
        Huawei huawei = new Huawei();
        huawei.call();

        huawei.sendMessage();
        System.out.println(huawei.brand);
        System.out.println(huawei.price);*/

        Iphone iphone = new Iphone();
        iphone.call();

    }
}
