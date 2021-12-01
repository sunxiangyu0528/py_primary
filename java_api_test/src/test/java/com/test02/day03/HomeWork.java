package com.test02.day03;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/29 20:03
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class HomeWork {
    public static void main(String[] args) {
        //1、打印直角三角形
        //for循环嵌套
        /*
         *
         **
         ***
         ****
         *****
         */
        /*for(int i = 0; i<5; i++){
            for(int j =0; j<i+1; j++){
                System.out.print("*");
            }
            //每一行打印结束后，换行
            System.out.println("");
        }
        */

        //2、写一段程序分别求出0到100之间所有的偶数的和以及奇数的和
        //偶数 怎么表示？  i%2 = 0
        //奇数怎么表示？？
        //循环 + if...else...
       /* int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<101; i++){
            if(i%2 == 0){
                //计算偶数和
                sum1 = sum1+i;
            }else{
                //计算奇数和
                sum2 = sum2+i;
            }
        }
        System.out.println("偶数和："+sum1);
        System.out.println("奇数和："+sum2);
        */

        //3、拓展题
        //打印等腰三角形
        //外层的for循环 控制行
        //for(int i =0; i<5;i++){

        //以第一行为例,先去把前面四个空格打印出来
        //空格的数量跟什么相关，当前的行数，总共的行数 总行数-当前的行数
        //第一行--》4个空格
        //第二行--》3个空格
        //第三行--》2个空格
        //第四行--》1个空格
        //里面for循环 控制列
            /*for(int j = 0; j< 5-i; j++){
                System.out.print(" ");
            }
            //打印*号
            for(int k =0 ; k<i+1;k++){
                System.out.print("* ");
            }
            //换行
            System.out.println("");
            */


        //冒泡排序
        int[] arr = {21, 12, 9, 40, 3};
        for (int i = 0; i < arr.length - 1; i++) {    //控制比较多少轮
            for (int j = 0; j < arr.length - 1 - i; j++) {    //控制相邻的两个数比较多少次。
                if (arr[j] > arr[j + 1]) {
                    //交换 第三变量交换
                    int temp = arr[j];    //空杯放入了J，J成了空的
                    arr[j] = arr[j + 1];    //J放入J+1,J+1成了空的
                    arr[j + 1] = temp;    //J+1放入空杯里面的J。
                }
            }
        }
    }

}
