package com.test02.day07;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 20:38
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class MainTest {
    public static void main(String[] args) {
        //AbstractTest abstractTest = new AbstractTest();
        //AbstractTest.play();
      /*  ChildTest childTest = new ChildTest();
        childTest.print();
        childTest.play();*/

      //实例化接口
       // InterfaceTest interfaceTest = new InterfaceTest();
        ImplementTest implementTest = new ImplementTest();
        implementTest.play();
       // implementTest.name="lisi";
        System.out.println(implementTest.name);
    }
}
