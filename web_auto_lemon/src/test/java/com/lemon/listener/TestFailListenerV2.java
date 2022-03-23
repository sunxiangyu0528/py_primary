package com.lemon.listener;

import com.lemon.common.BaseTest;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

/*
 * 监听类
 * 此种方案：用例失败截图保存到Allure报表中
 * IHookable接口，是由TestNG所提供的
 * 作用：在测试用例执行的时候动态替换@test注解标注的测试方法
 */
public class TestFailListenerV2 implements IHookable {
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        //替换@test注解标注的测试方法里面所有的代码
        //System.out.println("现在是IHookable接口的run方法执行");
        //让我们测试方法正常执行  iTestResult--》保存我们的测试结果
        iHookCallBack.runTestMethod(iTestResult);
        //跟我们监听用例失败有什么关系
        //iTestResult判断有没有失败（异常）
        if(iTestResult.getThrowable() != null){
            //截图
            //在监听类里面怎么获取到driver
            //getInstance--》获取实例（获取你当前正在运行测试类所对应的实例，比如：login_success LoginTest实例）
            //通过所有测试类的父类->BaseTest 来接收
            BaseTest baseTest = (BaseTest) iTestResult.getInstance();
            TakesScreenshot takesScreenshot = (TakesScreenshot) baseTest.driver;
            //OutputType.FILE-->输出类型为图片
            //OutputType.BYTES-->输出类型为byte[]
            byte[] screenshotData = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //嵌入到Allure报告中
            //Allure中有一个Attachments特性：只要你的方法返回的是byte[]类型，并且@Attachment注解标注
            //Allure就会把返回的结果作为附件的形式添加到Allure报告中
            saveToAllure(screenshotData);
        }
    }

    @Attachment(value = "screenshot", type = "image/png")
    public byte[] saveToAllure(byte[] screenshot){
        return screenshot;
    }
}
