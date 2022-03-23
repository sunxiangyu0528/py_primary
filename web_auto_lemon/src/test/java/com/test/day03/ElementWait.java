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

import java.util.concurrent.TimeUnit;

public class ElementWait {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("http://120.78.128.25:8765/Index/login.html");
        //设置全局隐式等待
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //隐式等待生效：当上述代码设置完之后，后面findElement找元素的话就会有隐式等待的效果
        //隐式等待只会针对于元素存在的情况（在dom中存在），不一定可见
        //driver.findElement(By.id("kw")).sendKeys("柠檬班");
        //driver.findElement(By.id("su")).click();
       // Thread.sleep(3000);
        //点击搜索“柠檬班_柠檬班腾讯课堂”
        //NoSuchElementExpection  可能的原因：是因为元素加载需要时间，跟代码的执行不同步
        //显示等待的方式
        //（1）创建WebDriverWait对象
        //超时时间默认就是为秒
        //WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        //（2）通过该对象所提供的方法 until  -->直到某个条件满足时为止
        //内置条件
        //presenceOfElementLocated  --> 元素在当前dom中存在  跟隐式等待的效果差不多
        //elementToBeClickable  -->元素可被点击 按钮/超链接
        //WebElement webElement = webDriverWait.
        //        until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='lemon.ke.qq.com/']")));
       // webElement.click();

        //visibilityOfElementLocated  --> 元素可见的  肉眼可见 输入框/获取到元素信息
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement =  webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phone")));
        webElement.sendKeys("13323234545");


        //隐式等待 VS 显示等待
        //1、作用域范围：隐式->全局生效 显示->针对某一个元素
        //2、条件范围：隐式->元素存在  显示->存在、可见、可被点击...
        //3、超时：  隐式->秒/分钟/天   显示->默认为秒
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
