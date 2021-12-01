package com.test02.day03;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/27 20:34
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class LoopTest {
    public static void main(String[] args) {
        //1、while循环
        /*
        初始化语句 1
        while(循环条件 2){
            循环体 3
            迭代语句 4
        }*/
        //需求1：通过while循环把1.2.3...10分别打印出来
        /*int a = 1;
        while(a<11){
            System.out.println(a);
            a++;
        }*/
        //需求2：通过while循环把1+2+3+..10总和打印出来
       /* int i = 1;
        //定义一个变量sum，用来接收每一次循环的的求和结果
        int sum = 0;
        while(i<11){
            //求和
            sum = i + sum;
            //第一次sum=1
            //第二次sum=3
            //第三次sum=6
            //...
            i++;
        }
        System.out.println(sum);*/

       //do...while...循环 -- 了解
        /*
        初始化语句 1
        do {
            循环体 3;
            迭代语句 4;
        }while(循环条件 2);
         */
        //需求：通过do...while...循环把1+2+3+..10总和打印出来
      /*  int i = 1;
        int sum = 0;
        do{
            sum = sum+i;
            i++;
        }while(i<11);
        System.out.println(sum);
        //第一次sum=1
        //第二次sum=2+1
        //第三次sum=3+3
        //...
        //第十次sum???
        */


        //for循环
        /*
        for(初始化语句 1 ;条件判断语句 2 ;迭代语句 4) {
			循环体 3 ;
        }
         */
        //需求：通过for循环把1+2+3+..10总和打印出来
        /*int sum = 0;
        for(int i = 1; i<11; i++){
            sum = i + sum;
        }
        System.out.println(sum);
        */
        //需求：:for循环打印出数组里的所有元素。int[] a  = {1,2,3,4,5,6,7,8,9};
        /*int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<a.length; i++){
            //不换行
            System.out.print(a[i]);
            System.out.print(",");
        }
        */
        //需求：输出如下数据
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        //一个for循环可以搞定？？
        // for循环嵌套 -- for循环里面还有for循环
        //外层for控制行数，里面for控制列
       /* for(int i = 1; i< 6; i++){
            //当i=2时==第一行，运行到里面的for循环
            for(int j = 1; j<i+1;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            //每一行打印结束之后，要换行处理
            System.out.println("");
        }
        */


       //foreach循环
        //需求：通过这个循环输出数组里面的每个元素
        /*
        for(数据类型 变量名 : 数组或者集合) {
	        //TODO
        }
         */
       /* int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int element : arr){
            //这个element不是索引，是数组里面的元素
            //在遍历数组的时候，把数组每一个元素的值保存在element变量中
            System.out.println(element);
        }
        */
        /*
        - continue
        跳过本次循环（忽略本次循环）--下一次循环还是会继续的执行
        - break
        跳出整个循环（结束整个循环）-- 后面的循环，所有的都会停掉
         */
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<a.length; i++){
            //不换行
            System.out.print(a[i]);
            System.out.print(",");
            //当循环执行到第5次的时候，停止掉
            if(i == 4){
                break;
            }

        }
    }
}
