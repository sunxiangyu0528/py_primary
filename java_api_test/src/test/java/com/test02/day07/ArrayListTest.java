package com.test02.day07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 21:33
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //1、实例化ArrayList对象
        //<> -- 》 泛型
        /*ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add(111);
        arrayList.add('a');
        System.out.println( arrayList.get(2));
         */

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("py");
        arrayList.add("java");
        arrayList.add("app");

        //arrayList.remove(1);
        //System.out.println( arrayList.isEmpty());
        //arrayList.set(1,"lemon");
        //System.out.println(arrayList.contains("java"));
        //System.out.println( arrayList.get(1));

        //1、普通的for循环遍历
        /*for(int i =0 ;i <arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }*/
        //2、增强式for循环-没有索引，语法更加简洁
        /*for(String str : arrayList){
            System.out.println(str);
        }*/
        //3、通过迭代器遍历
        //(1)、先去获取迭代器 -- 循环遍历
        //Iterator<String> ite = arrayList.iterator();
        //(2)、判断迭代里面是否有元素
        //while (ite.hasNext()){   //判断下一个元素是否存在
        //    System.out.println(ite.next());  //输出下一个元素
        //}

        //创建整数集合对象 -- 八大基本数据类型 有对应的包装类
        //int --> integer
        //boolean --> Boolean
        //char --> Character
        //...
        //ArrayList<Integer> arrayList1 = new ArrayList<Integer>();


    }
}
