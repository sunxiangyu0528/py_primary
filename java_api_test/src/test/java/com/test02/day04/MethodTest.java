package com.test02.day04;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/29 20:46
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class MethodTest {
    //全局变量
    static String name ="张三";
    //main方法/函数
    //static 静态
    public static void main(String[] args) {
        //String name = "李四";
        System.out.println(name);
        //静态方法调用方法，被调用的方法也必须得要是静态static
        //静态方法调用全局变量，被调用的变量也必须得要是静态static
        //int i = add(100,200);
        //System.out.println(i);
        //int result = countSum(1000);
        //System.out.println(result);
    }

    public static int countSum(int num){
        int sum = 0;
        //计算1+2+3+4+。。。100
        for(int i = 1; i<num+1;i++) {
            int b = 200;
            sum = sum + i;
        }


        return sum;
    }


    /*
    修饰符  函数返回值类型 函数名(参数类型 参数名...){
	函数体...
	参数的传递：更加具备通用性
	函数的返回：函数运行的时候的结果返回给调用方
    }
     */
    public static int add(int a, int b){
        int c = a + b;
        System.out.println("结果为："+c);
        return c;
    }



}
