package com.test.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class FirstWebAuto {
    public static void main(String[] args) throws InterruptedException {
        //openFirefox();
        //openIE();
        //怎么解决返回类型不匹配问题-->用父类来接受子类类型
        WebDriver driver = openBrowser("chrome");
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

    public static void openIE(){
        //取消IE安全设置（忽略IE的Protected Mode的设置）
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        //忽略浏览器缩放设置的
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer.exe");
        //InternetExplorerDriver ieDriver = new InternetExplorerDriver();
        InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
        ieDriver.get("https://www.baidu.com");

    }

    public static void openFirefox(){
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.baidu.com");
    }

    public static void openChrome(){
        //驱动？？？ 驱动浏览器（可执行的文件）
        //让代码知道chromeDriver驱动是保存在哪里
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        //1、打开浏览器（chrome）  实例化ChromeDriver对象即可
        ChromeDriver chromeDriver = new ChromeDriver();
        //2、访问百度
        chromeDriver.get("https://www.baidu.com");
    }
}
