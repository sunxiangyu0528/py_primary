package com.test02.day06;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/8 21:25
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "uello py26";
        String b = "Hello py26";
        //System.out.println(a.equals(b));
        //System.out.println(a.equalsIgnoreCase(b));
        String c = "abc|de|fgh|kdll";
        //String[] arr = c.split("|");
        //for(String i : arr){
         //   System.out.println(i);
        //}
        //String d = c.substring(2);
        //System.out.println(c);
        //System.out.println(d);
        //System.out.println(b.substring(2,5));
       // System.out.println(c.replace("|","111"));
        //System.out.println(c.contains("abcd"));
        //System.out.println(c.indexOf('b'));
        //System.out.println(c.lastIndexOf('b'));
        //System.out.println(c.startsWith("abcd"));
       // System.out.println(c.endsWith("dll"));
        //System.out.println(a.concat(b));
        //System.out.println(c.isEmpty());
        //String d = "   hello    ";
        //System.out.println(d.trim());
        //int[] arr = {1,2,3,4,5};
        //System.out.println(arr.length);
        //System.out.println(c.length());
        //char[] arr = a.toCharArray();
        //for (char i : arr){
        //    System.out.println(i);
        //}
        //String d = "abcdEH";
        //System.out.println(d.toUpperCase());
        //System.out.println(d.toLowerCase());

        //== 基本数据类型比较的是值，引用数据类型比较的是地址值。

        int i = 4;
        int j = 4;
        String arr1 = "hello";
        String arr2 = "hello";
        //equals 是Object类中的方法，基本数据类型无法调用
        Iphone iphone = new Iphone();
        Iphone iphone2 = new Iphone();
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1.equals(arr2));
        //equals默认使用==号，重写之后一般比较的是内容。
        //String类里面有重写了equals方法，里面的实现逻辑就会按照值去做比较
    }
}
