package com.lemon.listener;

import com.lemon.common.BaseTest;
import com.lemon.testcases.LoginTestV3;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

/*
 * 此种方案：用例失败截图保存到本地
 * IHookable接口，是由TestNG所提供的
 * 作用：在测试用例执行的时候动态替换@test注解标注的测试方法
 */
public class TestFailListenerV1 implements IHookable {
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        //替换@test注解标注的测试方法里面所有的代码
        //System.out.println("现在是IHookable接口的run方法执行");
        //让我们测试方法正常执行  iTestResult--》保存我们的测试结果
        iHookCallBack.runTestMethod(iTestResult);
        //跟我们监听用例失败有什么关系
        //iTestResult判断有没有失败（异常）
        if(iTestResult.getThrowable() != null){
            //截图
            System.out.println("开始截图");
            //在监听类里面怎么获取到driver
            //getInstance--》获取实例（获取你当前正在运行测试类所对应的实例，比如：login_success LoginTest实例）
            //通过所有测试类的父类->BaseTest 来接收
            BaseTest baseTest = (BaseTest) iTestResult.getInstance();
            System.out.println("iTestResult.getMethod()::"+iTestResult.getMethod());
            System.out.println("iTestResult.getName()::"+iTestResult.getName());
            System.out.println("iTestResult.getTestName()::"+iTestResult.getTestName());
            TakesScreenshot takesScreenshot = (TakesScreenshot) baseTest.driver;
            //如果你想要把图片保存到本地的化，那么指定输出类型为FILE即可
            //源文件
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            //把file文件对象保存到本地--》实体图片
            File targetFile = new File("D:\\lemon_"+iTestResult.getName()+".png");
            //拷贝动作 引入第三方依赖commons.io
            try {
                FileUtils.copyFile(srcFile,targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
