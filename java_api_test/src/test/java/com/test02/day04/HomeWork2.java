package com.test02.day04;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/6 20:07
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class HomeWork2 {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if(b == 0){
            System.out.println("被除数不能为0");
            return 0;
        }else {
            return a / b;
        }

    }
}
