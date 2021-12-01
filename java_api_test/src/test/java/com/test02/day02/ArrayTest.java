package com.test02.day02;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/24 20:22
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class ArrayTest {
    public static void main(String []args){
        //1、一维数组
        //1-1、数据类型[] 数组名 = new 数据类型[数组的长度];
        //int类型的数组，如果里面的数据没有初始化，值为0
        //int[] arr1 = new int[5];
        //float[] arr1 = new float[5];
        //boolean[] arr1 = new boolean[5];
        //System.out.println(arr1[0]);
        //1-2、数据类型[] 数组名 = {值1,值2,值3,值4};
        //int[] arr2 = {1,2,3,4,5};
        //System.out.println(arr2[1]);
        //对数组进行取值：数组名[索引],索引从0开始
        //对数组的元素进行赋值
        //数组的最大容量5个，索引范围0-4
        //int[] arr1 = new int[5];
        //ArrayIndexOutOfBoundsException 数组越界
        //arr1[5] = 10;
        //System.out.println(arr1[0]);
       // int[] arr2 = {1,2,3,4,5};
        //arr2[0] = 10;
       // System.out.println(arr2.length);


        //2、二维数组
        //1，2，3，4，5，6，7，8，9 一维数据
        //行+列
        //1，2，3，4，5
        //6，7，8，9，10,11
        //11，12，15
        //2-1、创建二维数组语法一
        //数据类型[][] 数组名 = new 数据类型[二位数组的长度][];
        int[][] arr = new int[3][];
        //怎么去规定里面的一维数组的长度,没有初始化一维数组的值
        arr[0] = new int[5];
        arr[1] = new int[6];
        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 3;
        arr[1][3] = 4;
        arr[1][4] = 5;
        arr[1][5] = 5;
        System.out.println(arr[0][4]);
       // int[][] arr = new int[3][5];
        //arr[0][0] = 1;
        //访问二维数组的第一个数据
        //java.lang.NullPointerException -- 空指针
        //int[3][] arr2  = {1,2,3,4,5};
        //System.out.println(arr[0][0]);
        //2-2、创建二维数组语法二
        //数据类型[][] 数组名 = {{值1，值2，}，{值1，值2}，{值1，值2}};
        //int[][] arr = {{1,2,3,4,5},{6,7,8,9,10,11},{11,12,15}};
        //System.out.println(arr[2][2]);
        //a,b
        //c,d,e
        //f,g
        //char[][] arr = {{'a','b'},{'c','d','e'},{'f','g'}};
        //打印二维数组的长度时，长度-->行数
        //System.out.println(arr[1].length);

    }
}
