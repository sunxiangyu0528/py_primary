package com.test.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import  org.openqa.selenium.WebDriver.Navigation;
import  org.openqa.selenium.WebDriver.Window;

public class WebDriverApiTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("https://www.baidu.com");
        //1、getCurrenturl  获取当前页面的URL地址
        //System.out.println(driver.getCurrentUrl());
        //2、getTitle 获取当前页面的标题
        //System.out.println(driver.getTitle());
        //3、getPageSource  -- 需要重点掌握
        //System.out.println(driver.getPageSource());
        //4、quit --关闭所有的窗口
        //driver.findElement(By.partialLinkText("hao123")).click();
        ///Thread.sleep(2000);
        //driver.quit();
        //5、close  --关闭当前的窗口
        //driver.close();

        //6、导航使用（包括浏览器刷新、前进、后退）
        ////获取navigate对象
/*        Navigation navigation = driver.navigate();
        ////访问指定的url地址
        Thread.sleep(2000);
        navigation.to("https://www.jd.com");
        Thread.sleep(2000);
        ////刷新当前页面
        navigation.refresh();
        Thread.sleep(2000);
        ////浏览器回退操作
        navigation.back();
        Thread.sleep(2000);
        ////浏览器前进操作
        navigation.forward();*/

        //7、windows相关操作
        //(1)、获取window对象
        Window window = driver.manage().window();
        //(2)浏览器最大化 maximize  --建议每一次打开浏览器之后都加上，可以避免很多问题（比如元素不可见）
        //window.maximize();
        //(3)浏览器全屏
        //window.fullscreen();
        //(4)获取到窗口位置  -以最左上角的点为原点，从左到右X轴，从上到下Y轴
        //System.out.println(window.getPosition().getX());
        //System.out.println(window.getPosition().getY());
        //(5)获取到窗口的大小
        //System.out.println(window.getSize().getWidth());
        //System.out.println(window.getSize().getHeight());
        //(6)设置窗口的位置
        //Point point = new Point(100,100);
        //window.setPosition(point);
        //(7)设置窗口的大小
        //Dimension dimension = new Dimension(800,600);
        //window.setSize(dimension);
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
