package com.lemon.listener;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * IRetryAnalyzer作用：如果你的用例执行失败的话，那么它就会触发执行对应的retry方法
 */
public class TestRetry implements IRetryAnalyzer {
    Logger logger = Logger.getLogger(TestRetry.class);
    //定义一个最多运行的重试次数
    int retryCount = 2;
    //当前重试次数
    int i = 0;
    public boolean retry(ITestResult iTestResult) {
        //返回true就表示执行重试机制
        //返回false不会执行重试机制
        //次数限制
        if(i < retryCount){
            i++;
            logger.info("当前去运行第"+i+"次重试机制");
            return true;
        }else{
            return false;
        }
    }
}
