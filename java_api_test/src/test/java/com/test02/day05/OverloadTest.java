package com.test02.day05;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 20:44
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class OverloadTest {

    public void sum(String n, int m){
        System.out.println("第一个sum方法");
    }

    public void sum(int m ,String n){
        System.out.println("第二个sum方法");
    }
}
