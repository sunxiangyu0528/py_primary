package com.lemon.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * 所有用例的父类
 * 1、打开浏览器、关闭浏览器
 * 2、导航对象，刷新、后退、前进
 */
public class BaseTest {
    Logger logger = Logger.getLogger(BaseTest.class);
    //driver放到BaseTest父类中
    public WebDriver driver;
    /**
     * 统一封装打开浏览器方法
     * @param browserName 浏览器名字
     * @return webDriver
     */
    public void openBrowser(String browserName) {
        logger.info("=================打开浏览器【"+browserName+"】=================");
        if (browserName.equals("chrome")) {
            //驱动？？？ 驱动浏览器（可执行的文件）
            //让代码知道chromeDriver驱动是保存在哪里
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            //1、打开浏览器（chrome）  实例化ChromeDriver对象即可
            ChromeDriver chromeDriver = new ChromeDriver();
            driver=chromeDriver;
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            driver=firefoxDriver;
        } else if (browserName.equals("ie")) {
            //取消IE安全设置（忽略IE的Protected Mode的设置）
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //忽略浏览器缩放设置的
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
            //InternetExplorerDriver ieDriver = new InternetExplorerDriver();
            InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
            driver=ieDriver;
        }

    }

    public void to(String url){
        logger.info("访问地址【"+url+"】");
        driver.get(url);
    }

    public void browserMaxmize(){
        logger.info("浏览器最大化");
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        logger.info("=================关闭浏览器=================");
        driver.quit();
    }

    public void refreshBrowser(){
        logger.info("=================刷新浏览器=================");
        Navigation navigation = driver.navigate();
        navigation.refresh();
    }

    public void forwardBrowser(){
        logger.info("=================浏览器前进=================");
        Navigation navigation = driver.navigate();
        navigation.forward();
    }

    public void backBrowser(WebDriver driver){
        logger.info("=================浏览器后退=================");
        Navigation navigation = driver.navigate();
        navigation.back();
    }
}
