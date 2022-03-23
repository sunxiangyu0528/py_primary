package com.test.day04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class SpecialElement {
    public static void main(String[] args) throws InterruptedException {
        //1、Alert弹窗的处理
        WebDriver driver = openBrowser("chrome");
        /*driver.get("C:\\Users\\86180\\Desktop\\homework.html");
        driver.findElement(By.id("username")).sendKeys("lemon");
        driver.findElement(By.id("pwd")).sendKeys("123456");
        driver.findElement(By.id("login")).click();
        //Alert切换
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        //alert.accept();
        alert.dismiss();
        Thread.sleep(2000);
        driver.quit();*/

        //2、iframe切换
        /*driver.get("https://ke.qq.com/");
        driver.findElement(By.id("js_login")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='QQ登录']")).click();
        Thread.sleep(3000);
        //（1）、通过index索引来切换  索引从0开始
        //driver.switchTo().frame(2);
        //（2）、根据id来切换
        //（3）、根据找到iframe元素去切换  重点掌握下
        WebElement webElement = driver.findElement(By.name("login_frame_qq"));
        driver.switchTo().frame(webElement);
        //此元素在iframe中
        driver.findElement(By.id("switcher_plogin")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("u")).sendKeys("1425301899");
        driver.findElement(By.id("p")).sendKeys("123456");
        driver.findElement(By.id("login_button")).click();
        Thread.sleep(2000);
        //一级一级回到上一层页面中
        //driver.switchTo().parentFrame();
        //一次性回到默认页面中，去定位默认页面的元素
        driver.switchTo().defaultContent();
        //点击关闭
        driver.findElement(By.id("login_close")).click();
        driver.findElement(By.id("js_login")).click();*/

        //3、window窗口切换
       /* driver.get("https://www.baidu.com");
        //System.out.println("点击新窗口之前："+driver.getWindowHandle());
        //点击了这个链接，驱动不会认为打开了一个新的窗口
        driver.findElement(By.linkText("hao123")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("新闻")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("学术")).click();*/
        //Thread.sleep(2000);
        //获取到当前driver对应的窗口句柄（并不是你肉眼所看到的那个）
        //System.out.println("第一个窗口的句柄："+driver.getWindowHandle());
        //两个窗口的切换  -- 局限性
      /*  String beforeHandle = driver.getWindowHandle();
        //问题点：怎么来获取新的窗口句柄？？？
        // 获取到所有的窗口句柄，把第一个给剔除掉
        Set<String> handles = driver.getWindowHandles();
        String secondHandle = "";
        System.out.println(handles.size());
        for(String handle : handles){
            if(handle.equals(beforeHandle)){
               continue;
            }
             secondHandle = handle;
        }
        //System.out.println("第二个窗口的句柄："+secondHandle);
        //切换窗口
        driver.switchTo().window(secondHandle);
        driver.findElement(By.xpath("//a[text()='腾讯']")).click();*/

        //多个窗口的切换（同时有两个新的窗口以上）
      /*  Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            //难点：怎么去找到对应窗口的句柄呢 --根据窗口的信息（title、url）
            if(driver.getTitle().equals("hao123_上网从这里开始")){
                //driver现在是在正确的窗口中-- 同样说明现在的handle也是正确，我们不需要再切换了
            }else{
                //切换handle句柄
                driver.switchTo().window(handle);
            }
        }
        driver.findElement(By.xpath("//a[text()='腾讯']")).click();*/

        //NoSuchElementException 可能的原因
        //1、定位表达式写错了
        //2、元素没有加载出来，等待
        //3、元素在iframe中
        //4、元素在新的窗口里面

        //4、select下拉框
 /*       driver.get("C:\\Users\\86180\\Desktop\\selectTest.html");
        WebElement webElement = driver.findElement(By.id("test"));
        Select select = new Select(webElement);
        Thread.sleep(2000);
        //根据索引选择对应选项
        //select.selectByIndex(1);
        //根据文本选择
        select.selectByVisibleText("英文");*/

        //5、鼠标操作

        //例子一
        /*driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //百度设置
       WebElement webElement = driver.findElement(By.id("s-usersetting-top"));
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();*/

        //例子二
        driver.get("http://www.treejs.cn/v3/demo/cn/exedit/drag.html");
        //随意拖拽1-1 treeDemo_2_span
        WebElement webElement1 = driver.findElement(By.id("treeDemo_2_span"));
        //随意拖拽1-2 treeDemo_3_span
        WebElement webElement2 = driver.findElement(By.id("treeDemo_3_span"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(webElement1).moveToElement(webElement2).release().build().perform();

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
