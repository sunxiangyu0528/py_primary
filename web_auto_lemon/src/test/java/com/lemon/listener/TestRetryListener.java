package com.lemon.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * IRetryAnalyzer作用：如果你的用例执行失败的话，那么它就会触发执行对应的retry方法
 */
public class TestRetryListener implements IRetryAnalyzer {
    int retryCount = 2;
    int i = 0;
    public boolean retry(ITestResult iTestResult) {
        //返回true就表示执行重试机制
        //返回false不会执行重试机制
        //次数限制
        if(i < retryCount){
            i++;
            return true;
        }else{
            return false;
        }
    }
}
