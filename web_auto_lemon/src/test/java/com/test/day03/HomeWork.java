package com.test.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Navigation;

public class HomeWork {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //打开chrome浏览器
        driver = openBrowser("chrome");
        //窗口最大化
        driver.manage().window().maximize();
        //打开测试派
        driver.get("http://testingpai.com/");
        //点击登录向导
        waitElementClickable(By.id("navLogin")).click();
        Thread.sleep(1000);
        //输入用户名
        waitElementVisible(By.xpath("//input[@placeholder='用户名/邮箱/手机号']")).sendKeys("lemontest");
        //输入密码
        waitElementVisible(By.id("loginPassword")).sendKeys("lemon123456");
        //点击登录按钮
        waitElementClickable(By.id("loginBtn")).click();
        Thread.sleep(1000);
        //进入需要答复的帖子
        waitElementClickable(By.linkText("20200930_web 自动化 API 练习和三大等待")).click();
        //点击回帖内容区域
        Thread.sleep(1000);
        waitElementClickable(By.xpath("//span[text()='请输入回帖内容...']")).click();
        //输入回帖内容
        waitElementVisible(By.xpath("//div[@class='vditor-ir']/pre[@placeholder='请输入回帖内容']")).sendKeys("回帖测试");
        //点击提交按钮
        waitElementClickable(By.id("commentSubmitBtn")).click();
        //获取最新回复的贴子内容
        String text = waitElementVisible(By.xpath("//div[@data-author='lemontest']")).getText();
        System.out.println(text);
        Navigation navigation = driver.navigate();
        navigation.back();
        navigation.refresh();
        Thread.sleep(5000);
        driver.quit();

    }

    public static WebElement waitElementVisible(By by){
        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        return  webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static WebElement waitElementClickable(By by){
        //by变量保存的是元素的定位信息：元素的定位方式 + 元素定位值  By.xpath("//a[text()='']")
        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        return  webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
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
