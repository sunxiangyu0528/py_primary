package com.lemon.testcases;

import com.lemon.common.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest extends BaseTest {
    @Test
    public void saveScreenShot() throws InterruptedException {
        openBrowser("chrome");
        driver.get("https://www.jd.com");
        Thread.sleep(5000);
        //WebDriver对象没有截图的API
        //JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        //如果你想要把图片保存到本地的化，那么指定输出类型为FILE即可
        //源文件
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //把file文件对象保存到本地--》实体图片
        File targetFile = new File("D:\\lemon.png");
        //拷贝动作 引入第三方依赖commons.io
        try {
            FileUtils.copyFile(srcFile,targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
