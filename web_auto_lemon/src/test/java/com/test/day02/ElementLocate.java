package com.test.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

public class ElementLocate {
    public static void main(String[] args) {
        //打开chrome浏览器
        WebDriver driver = openBrowser("chrome");
        //这里打开浏览器的时候相当于是一个全新的浏览器（里面的没有任何的数据）
        driver.get("https://www.ketangpai.com/");
        //1、id定位  -- 元素id属性定位（id唯一的）
        //WebElement webElement =  driver.findElement(By.id("kw"));
        //webElement.sendKeys("柠檬班");
        //2、name定位 --元素name属性定位--人的姓名
        //driver.findElement(By.name("wd")).sendKeys("柠檬班");
        //3、tagName定位  --元素标签名定位 --用的比较少
        //findElement去找元素的时候，如果元素的属性/标签名有重复的，那么就会默认找第一个
        //findElements 去找到所有的元素
        //driver.findElement(By.tagName("input")).sendKeys("柠檬班");
        //List<WebElement> list = driver.findElements(By.tagName("input"));
        //System.out.println(list.size());
        //4、className定位  -- 根据class属性（样式）
        //className不支持复合类名
        //driver.findElement(By.name("wd")).sendKeys("柠檬班");
        //driver.findElement(By.className("bg s_btn btn_h btnhover")).click();
        //driver.findElement(By.className("s_btn")).click();
        //5、超链接完整文本 -linkText
        //driver.findElement(By.linkText("hao123")).click();
        //6、超链接的部分文本 -partialLinkText
        //driver.findElement(By.partialLinkText("hao123")).click();

        //7、cssSelector -- CSS样式选择器
        //（1） tagName定位
        //List<WebElement> list = driver.findElements(By.cssSelector("input"));
        //System.out.println(list.size());
        //（2）id定位
        //driver.findElement(By.cssSelector("#kw")).sendKeys("123");
        //tagName + id 结合
        //driver.findElement(By.cssSelector("input#kw")).sendKeys("123");
        //（3） classname样式 -- 可以支持复合类名，也可以支持单个类名
        //driver.findElement(By.cssSelector("#kw")).sendKeys("123");
        //driver.findElement(By.cssSelector(".s_btn")).click();

        //（4）单属性选择 -支持元素的全部属性（不能支持文本）
        //driver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("123");

        //（5）多属性选择 --同时支持多个属性定位
        //driver.findElement(By.cssSelector("input[name='wd'][maxlength='255'][autocomplete='off']")).sendKeys("123");

        //8、xpath定位 -- 重点掌握的
        //（1）xpath绝对定位
        //driver.findElement(By.xpath("html/body/div[1]/div[3]/a/span")).click();
        //（2）xpath相对定位
        //属性选择  @后面跟着的是属性名
        //   //*[@name='wd']
        //文本选择  text()文本函数  文本匹配用的
        //   //*[text()='hao123']
        //模糊匹配 contains() 包含（模糊匹配）
        //文本模糊匹配
        //   //*[contains(text(),'hao123')]
        //属性模糊匹配
        //

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
