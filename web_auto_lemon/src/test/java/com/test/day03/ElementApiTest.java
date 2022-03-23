package com.test.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ElementApiTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = openBrowser("chrome");
        driver.get("https://www.ketangpai.com/");
        //WebElement webElement = driver.findElement(By.id("kw"));
       // webElement.sendKeys("123456");
        //点击完毕之后，让代码暂停（休眠）一会儿
       // Thread.sleep(3000);
        //1、clear 清楚文本输入框内容
        //webElement.clear();
        //2、sendKeys按键操作
/*        webElement.sendKeys(Keys.CONTROL,"a");
        Thread.sleep(2000);
        webElement.sendKeys(Keys.CONTROL,"c");
        Thread.sleep(2000);
        webElement.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(2000);
        webElement.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(2000);
        webElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        webElement.sendKeys(Keys.BACK_SPACE);*/
        //getTagName  获取元素标签名  --用的比较少
        //getAttributeName  获取元素属性值（属性名）  --用的会比较多
        //System.out.println(webElement.getTagName());
        //System.out.println(webElement.getAttribute("maxlength"));
        //getText() 获取元素文本值  --用的比较多
        //WebElement webElement = driver.findElement(By.partialLinkText("贴吧"));
        //System.out.println(webElement.getText());
        //isDisplayed  判断元素是否显示
        driver.findElement(By.className("layui-layer-close")).click();
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath("//a[text()='申请机构版']"));
        System.out.println(webElement.isDisplayed());
        // element not interactable 元素不可交互 可见：肉眼可见
        webElement.click();
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
