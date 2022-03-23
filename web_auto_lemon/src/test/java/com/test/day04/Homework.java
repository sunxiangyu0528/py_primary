package com.test.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("file:///D:/homework/a.html");
        Thread.sleep(2000);
        driver.findElement(By.id("aa")).sendKeys("AAA");
        //切换iframe
        driver.switchTo().frame("bframe");
        Thread.sleep(2000);
        driver.findElement(By.id("bb")).sendKeys("BBB");
        //切换iframe
        Thread.sleep(2000);
        driver.switchTo().frame("cframe");
        driver.findElement(By.id("cc")).sendKeys("CCC");
        Thread.sleep(2000);
        //回到上一级iframe中
        driver.switchTo().parentFrame();
        driver.findElement(By.id("bb")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("bb")).sendKeys("DDD");
        Thread.sleep(2000);
        //回到默认页面
        driver.switchTo().defaultContent();
        driver.findElement(By.id("aa")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("aa")).sendKeys("完成");
        Thread.sleep(2000);
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
