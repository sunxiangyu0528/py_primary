package com.test.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class SpecialElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        //1、飞猪
/*        driver.get("https://www.fliggy.com/ijipiao/?ttid=seo.000000574&seoType=origin");
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath("//div[text()='出发日期:']/following-sibling::div[1]/input"));
        webElement.clear();
        Thread.sleep(2000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('placeholder','2020-10-16')",webElement);*/


        //2、12306
        //driver.get("https://www.12306.cn/index/");
        /*driver.findElement(By.id("train_date")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("train_date")).sendKeys("2020-10-15");*/
        //问题：怎么在Java代码中去调用JavaScript
        //JavascriptExecutor --> JavaScript执行者
        //ChromeDriver chromeDriver = new ChromeDriver();
        //不传参
        /*JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("document.getElementById('train_date').removeAttribute('readonly')");*/
       /* String attributeValue="readonly";
        //String date="train_date";
        WebElement webElement = driver.findElement(By.id("train_date"));
        //传参
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("webElement.removeAttribute(arguments[1])",webElement,attributeValue);
        Thread.sleep(2000);
        driver.findElement(By.id("train_date")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("train_date")).sendKeys("2020-10-15");*/

        //
        //driver.get("https://www.layui.com/demo/form.html");
        //driver.findElement(By.id("date")).sendKeys("2020-10-20");

        //JavaScript 滚动到页面的最底部
        /*driver.get("https://www.12306.cn/index/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/

        //JavaScript 滚动到指定元素位置上
        /*driver.get("https://www.12306.cn/index/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.id("index_ads"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true)",webElement);*/

        //懒加载
        //driver.get("https://www.wandoujia.com/top/app");
        //driver.findElement(By.xpath("//a[@title='手机淘宝']")).click();
        //查看更多元素
        //查看更多元素到底要点多少次 不确定  对应App才能加载出来

       /* while(true) {
            //条件：什么时候退出-->找到元素之后
            //如何判断页面中有此元素
            if(driver.getPageSource().contains("手机淘宝")){
                driver.findElement(By.xpath("//a[@title='手机淘宝']")).click();
                break;
            }
            Thread.sleep(1000);
            //滚动到指定元素上-->查看更多元素
            WebElement webElement = driver.findElement(By.id("j-refresh-btn"));
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].scrollIntoViewIfNeeded(true)", webElement);
            driver.findElement(By.id("j-refresh-btn")).click();
        }*/

        //文件上传
        //1、元素为input标签，并且type为file文件上传
        /*driver.get("C:\\Users\\86180\\Desktop\\fileupload.html");
        Thread.sleep(2000);
        driver.findElement(By.id("test")).sendKeys("D:\\test.png");*/
        //2、元素不为input标签
       /* driver.get("https://www.layui.com/demo/upload.html");
        //driver.findElement(By.id("test1")).sendKeys("D:\\test.png");
        //上传的windows窗口--点击上传按钮
        driver.findElement(By.id("test1")).click();
        //执行autoit转换之后的exe文件
        //1、生成runtime对象  -》Java运行时对象，有提供了执行exe文件API
        Runtime runtime = Runtime.getRuntime();
        //2、runtime的exec方法
        try {
            runtime.exec("src/test/resources/autoittest.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    /**
     * 统一封装打开浏览器方法
     * @param browserName 浏览器名字
     * @return webDriver
     */
    public static WebDriver openBrowser(String browserName) {
        if (browserName.equals("chrome")) {
            //驱动？？？ 驱动浏览器（可执行的文件）
            //让代码知道chromeDriver驱动是保存在哪里
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            //1、打开浏览器（chrome）  实例化ChromeDriver对象即可
            ChromeDriver chromeDriver = new ChromeDriver();
            return chromeDriver;
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            return firefoxDriver;
        } else if (browserName.equals("ie")) {
            //取消IE安全设置（忽略IE的Protected Mode的设置）
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //忽略浏览器缩放设置的
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
            //InternetExplorerDriver ieDriver = new InternetExplorerDriver();
            InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
            return ieDriver;
        }
        return null;
    }
}
