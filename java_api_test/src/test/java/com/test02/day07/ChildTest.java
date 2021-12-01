package com.test02.day07;

/**
 * @author 歪歪欧巴
 * @Description: TODO
 * @date 2020/5/11 20:42
 * @Copyright:湖南省零檬信息技术有限公司. All rights reserved.
 */
//子类必须实现父类里面的抽象方法
public class ChildTest extends AbstractTest {
    @Override  //注解，规则说明 ，如果加了这个注解，表明它是一个复写的方法
    public void print() {
        System.out.println("print");
    }
}
