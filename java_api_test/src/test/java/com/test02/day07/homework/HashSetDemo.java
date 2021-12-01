package com.test02.day07.homework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/13 13:39
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
//        1、往这个HashSet对象里添加如下String类型的数据：“张三”，“李四”，“王五”，“张三”，”赵六”
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("张三");
        hashSet.add("赵六");
//        2、判断这个集合是否为空，并打印判断的结果。
        System.out.println(hashSet.isEmpty());
//        3、打印这个集合的大小。
        System.out.println(hashSet.size());
//        4、判断这个集合是否包含数据"王五"。
        System.out.println(hashSet.contains("王五"));
//        5、将”张三”这条数据删掉。
        hashSet.remove("张三");
//        6、利用迭代器迭代获取set集合中的每个元素，并打印。
        Iterator<String> ite = hashSet.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
//        7、将set转换成数组。并循环打印数组中的元素。
        Object[] arr = hashSet.toArray();
        for (Object element : arr) {
            System.out.println(element);
        }
    }
}
