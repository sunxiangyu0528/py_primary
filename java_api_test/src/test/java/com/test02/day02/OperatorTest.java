package com.test02.day02;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/4/24 21:18
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
public class OperatorTest {
    public static void main(String[] args) {
        //1、算术运算符
        //int a = 10;
        //int b = 4;

        //System.out.println(--a);
        //System.out.println(a);
        //++，--放到变量的后面，先去拿原本的值进行输出/运算，再去+1/-1
        //++，--放到变量的前面，先去进行+1/-1的运算，再去输出/运算

        //2、赋值运算符
        // int a = 10;
        //int b = 5;
        //效果等同于a=a+b
        //a+=b;
        // System.out.println(a);

        //3、比较运算符
        //System.out.println(3 == 3.0);

        //4、逻辑运算符
        //boolean a = false;
        //boolean b = false;
        //逻辑与 -- 只要有一个为假，结果就是为假,两者都为真，结果才为真
        //System.out.println(a & b);
        //逻辑或 -- 只要有一个为真，结果就真,两者都为假，结果才为假
        //System.out.println(a | b);
        //短路与
        // 1、要有一个为假，结果就是为假,两者都为真，结果才为真
        // 2、前面的表达式为假，后面的表达式不会执行
        //int a = 10;
        //int b = 5;
        //((a+1)>11)  -->假
        //(++b>5)  -->真
        //System.out.println(((a+1)>11) && (++b>5));
        //System.out.println(b);
        //短路或
        // 1、只要有一个为真，结果就真,两者都为假，结果才为假
        // 2、前面的表达式为真，后面的表达式不会执行
        //int a = 10;
        //int b = 5;
        //System.out.println((a+1)>11 || (++b>5));
        //System.out.println(b);
        //取反--对原本的逻辑进行取反
        //int a = 10;
        //boolean b = false;
        //System.out.println(!b);

        //三目运算符
        //逻辑表达式E  ?  E为true的值  : E为false的值
        //int a = 10;
        //System.out.println((a+1)>11 ? a++:a--);

        //运算顺序
        //++，--
        //括号
        //*，/ ，% （同一优先级，从左至右）
        //+，-   (同一优先级，从左至右)
        int a = 10;
        int b = 5;
        //++如果时放到变量的后面，先去拿变量原本的值参与运算/输出，表达式运算结束之后+1
        //1、先去运算a++  表达式结果=10，a变成了11
        //2、a--  表达式的结果=11，a最后变成了10
        //3、运算+a
        //a++ + a--
        //System.out.println(a+++a--);
        //1、a++ 表达式结果=10，a变成了11
        //2、a-- 表达式结果=11，a变成10
        //3、a++*a-- 10*11 = 110
        //4、a+a++*a-- 110+10 = 120
       // System.out.println(a+a++*a++);
    }
}
