package com.lemon.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprovider {


    @Test
    public void printName1(){
        //步骤
        System.out.println("获取名字");
        //打印名字
        String name = "张三";
        System.out.println(name);
    }

    @Test
    public void printName2(){
        //步骤
        System.out.println("获取名字");
        //打印名字
        String name = "李四";
        System.out.println(name);
    }

    @Test
    public void printName3(){
        //步骤
        System.out.println("获取名字");
        //打印名字
        String name = "王五";
        System.out.println(name);
    }

    //数据驱动
    //DataProvider --> 数据提供者（所有数据）
    //DataProvider 标注的测试方法，对应测试方法返回值必须要是Object[][]

    @DataProvider
    public Object[][] allDatas(){
        Object[][] datas = {{"张三","20"},{"李四","18"},{"王五","25"},{"赵六","30"}};
        return datas;
    }

    //1、把数据源的数据@Test里面
    //2、通过测试方法形参来接受
    @Test(dataProvider = "allDatas")
    public void print(String name, String age){
        //步骤
        System.out.println("获取名字");
        //打印名字
        System.out.println(name);
        System.out.println(age);
    }
}
