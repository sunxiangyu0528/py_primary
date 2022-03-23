package com.lemon.listener;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 监听类
 * 可以在测试用例运行的时候动态改变@test注解的参数
 */
public class TestngRetryListener implements IAnnotationTransformer {
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        //1、获取到@test注解的参数retryAnalyzer对象
        IRetryAnalyzer retryAnalyzer = iTestAnnotation.getRetryAnalyzer();
        //2、判断retryAnalyzer对象是不是空，如果为空就表示@test注解没有设置retryAnalyzer参数
        if(retryAnalyzer == null){
            //3、为每一个测试方法@test注解上面加上retryAnalyzer参数
            iTestAnnotation.setRetryAnalyzer(TestRetry.class);
        }
    }
}
