package com.test02.day03;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/27 21:40
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class ConditionTest {
    public static void main(String[] args) {
        //1、if...else...
       /* int i = 100;
        if(i>=100){
            System.out.println("结果为真");
        }*/
      /* int i = 100;
       if(i<100){
           System.out.println("i小于100");
       }else if(i==100){
           System.out.println("i等于100");
       }else{
           //当前面的条件都不满足的情况下，会执行这里的语句
           System.out.println("i大于100");
       }*/
      //需求：根据成绩-分数打印出等级A，B,C,D
       //80-100 输出优秀
       //70-80 输出良好
       //60-70 及格
       //0-60 不及格

        //第一个版本
        /*if(score<60){
            System.out.println("不及格");
        }else if(score>=60 && score<70){
            System.out.println("及格");
        }else if(score>=70 && score <80){
            System.out.println("良好");
        }else{
            System.out.println("优秀");
        }*/
        /*
        int score = 60;
        if(score>=80){
            System.out.println("优秀");
        }else if(score >=70){
            System.out.println("良好");
        }else if(score >=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }*/

        //switch语句
        /*
        switch(值){
            case 值A:
                //TODO
                break;
            case 值B:
                //TODO
                break;
            default:
                //TODO
                break;
        }
         */
        //需求：根据变量的值做匹配，比如值为a，输出第一个，值为b，输出第二个
        /*char i = 'b';
        switch (i){
            case 'a':
                System.out.println("第一种");
                break;
            case 'b':
                System.out.println("第二种");
                break;
            case 'c':
                System.out.println("第三种");
                break;
            default:
                System.out.println("不符合前面的三种");
                break;
        }*/
        //需求：根据成绩-分数打印出等级A，B,C,D
        //80-100 输出优秀
        //70-80 输出良好
        //60-70 及格
        //0-60 不及格
        //switch语句来实现？？
        /*int score = 80;
        //%运算符  80/10 = 8  81/10 = 8 82/10 = 8
        //score/10 结果范围 0-10
        switch (score/10){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("不及格");
                break;
            case 3:
                System.out.println("不及格");
                break;
            case 4:
                System.out.println("不及格");
                break;
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("良好");
                break;
            case 8:
                System.out.println("优秀");
                break;
            case 9:
                System.out.println("优秀");
                break;
            case 10:
                System.out.println("优秀");
                break;
        }*/

    }
}
