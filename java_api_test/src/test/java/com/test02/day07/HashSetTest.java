package com.test02.day07;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 22:01
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class HashSetTest {
    public static void main(String[] args) {
        //1、创建HashSet对象
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("py26");
        hashSet.add("lemon");
        hashSet.add("py26");
        /*System.out.println(hashSet.size());
        hashSet.remove("world");
        hashSet.clear();
        System.out.println(hashSet.size());*/
        //循环遍历-1
        //System.out.println(hashSet.get);
        //hashSet转换为数组
        /*Object[] arr = hashSet.toArray();
        for (Object obj : arr){
            System.out.println(obj);
        }*/

        //循环遍历-2
       Iterator<String> ite =  hashSet.iterator();
       while (ite.hasNext()){
           System.out.println(ite.next());
       }
    }
}
