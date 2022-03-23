package com.lemon.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.WebEndpoint;

public class LoginTest {
    public static void main(String[] args) {
        //前置条件：进入到登录页面
        WebDriver driver = openBrowser("chrome");
        driver.get("http://120.78.128.25:8765/Index/login.html");
        //测试步骤
        //1、输入手机号码 -正确的
        driver.findElement(By.name("phone")).sendKeys("13323234545");
        //2、输入密码 -正确的
        driver.findElement(By.name("password")).sendKeys("lemon123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();
        //预期结果 --断言（判断实际结果和期望结果是否相符）
        //eg：
        // 1、根据我的账户元素是否出现
        WebDriverWait webDriverWait = new WebDriverWait(driver,8);
        try {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'我的帐户')]")));
            System.out.println("用例通过");
        }catch (TimeoutException e){
            System.out.println("用例不通过");
        }


        // 2、URL地址发生了变化
        String expectedUrl="http://120.78.128.25:8765/Index/index";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        if(expectedUrl.equals(actualUrl)){
            System.out.println("用例通过");
        }else{
            System.out.println("用例不通过");
        }
        //测试结束后-关闭浏览器

        //1、用例多了之后，无法有效的统计全部用例结果
        //2、用例结果逻辑混乱
        //3、用例多了之后，用例怎么执行？？
        //通过单元测试框架TestNG统计用例结果、管理用例
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
