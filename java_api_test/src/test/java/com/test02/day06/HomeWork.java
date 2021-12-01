package com.test02.day06;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 19:50
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class HomeWork {
    public String a = "hello";

    public static void splitStr(){
        String str = "TOM:20|Jack:22|Rose:24";
        String[] arr1 = str.split("\\|");
        for (String keyAndValue : arr1) {
            String[] arr2 = keyAndValue.split(":");
            System.out.println("姓名："+arr2[0]+",年龄："+arr2[1]);
        }
    }

    public static void reverseStr(String str){
        String afterStr = "";
        if(str != null) {
            //把字符串转换位字符数组
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                //
                afterStr = arr[i] + afterStr;
            }
        }
        //a
        //b+a = ba
        //c+ba = cba
        System.out.println(afterStr);
    }

    public static void main(String[] args) {
        //splitStr();
        reverseStr("abcd");
    }
}
