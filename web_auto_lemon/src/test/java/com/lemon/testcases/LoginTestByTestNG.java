package com.lemon.testcases;

import com.lemon.pages.IndexPage;
import com.lemon.pages.LoginPage;
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
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestByTestNG {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //前置
        //前置条件：进入到登录页面
        driver = openBrowser("chrome");
        driver.get("http://120.78.128.25:8765/Index/login.html");
    }

    /*
     * 登录的正常功能验证
     */
    @Test
    public void login_sucesss(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("13323234545","lemon123456");
        //测试步骤
        /*//1、输入手机号码 -正确的
        driver.findElement(By.name("phone")).sendKeys("13323234545");
        //2、输入密码 -正确的
        driver.findElement(By.name("password")).sendKeys("lemon123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //预期结果 --断言（判断实际结果和期望结果是否相符）
        //eg：
        // 1、根据我的账户元素是否出现
        IndexPage indexPage = new IndexPage(driver);
        Assert.assertTrue(indexPage.isMyAccountVisible());
       /*  WebDriverWait webDriverWait = new WebDriverWait(driver,8);
       try {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'我的帐户')]")));
            Assert.assertTrue(true);
        }catch (TimeoutException e){
            Assert.assertTrue(false);
        }*/

        // 2、URL地址发生了变化
        String expectedUrl="http://120.78.128.25:8765/Index/index";
        String actualUrl = driver.getCurrentUrl();
/*        if(expectedUrl.equals(actualUrl)){
            System.out.println("用例通过");
        }else{
            System.out.println("用例不通过");
        }*/
        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @AfterMethod
    public void teardownMethod(){
        //用例后置，测试结束后-关闭浏览器
        driver.quit();
    }


    /*
     * 用户账号未注册进行登录
     */
    @Test
    public void login_mobilephone_unregister(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("15859019266","123456");
        //测试步骤
        //1、输入手机号码 -未注册的
        /*driver.findElement(By.name("phone")).sendKeys("15859019266");
        //2、输入密码
        driver.findElement(By.name("password")).sendKeys("123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //断言 -- 根据网页中间的提示信息
        /*WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("layui-layer-content")));
       // WebElement webElement = driver.findElement(By.className("layui-layer-content"));
        String actualValue = webElement.getText();*/
        String actualValue = loginPage.getCenterTips();
        String expectedValue = "此账号没有经过授权，请联系管理员!";
        Assert.assertEquals(actualValue,expectedValue);
    }

    /*
     * 手机号码为空的情况
     */
    @Test
    public void login_mobilephone_isnull(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("","123456");
        //测试步骤
        //1、输入手机号码 -为空
        /*driver.findElement(By.name("phone")).sendKeys("");
        //2、输入密码
        driver.findElement(By.name("password")).sendKeys("123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //断言 -- 根据输入框的提示信息
        /*WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-error-info")));
        String actualValue = webElement.getText();*/
        String actualValue = loginPage.getInputTips();
        String expectedValue = "请输入手机号";
        Assert.assertEquals(actualValue,expectedValue);
    }

    /*
     * 手机号码错误的情况 -10位的手机号码
     */
    @Test
    public void login_mobilephone_error1(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("1585901925","123456");
        //测试步骤
        //1、输入手机号码 -为空
/*        driver.findElement(By.name("phone")).sendKeys("1585901925");
        //2、输入密码
        driver.findElement(By.name("password")).sendKeys("123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //断言 -- 根据输入框的提示信息
/*        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-error-info")));
        String actualValue = webElement.getText();*/
        String actualValue = loginPage.getInputTips();
        String expectedValue = "请输入正确的手机号";
        Assert.assertEquals(actualValue,expectedValue);
    }

    /*
     * 手机号码错误的情况 -12位的手机号码
     */
    @Test
    public void login_mobilephone_error2(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("158590192534","123456");
        //测试步骤
        //1、输入手机号码 -为空
/*        driver.findElement(By.name("phone")).sendKeys("158590192534");
        //2、输入密码
        driver.findElement(By.name("password")).sendKeys("123456");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //断言 -- 根据输入框的提示信息
  /*      WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-error-info")));
        String actualValue = webElement.getText();*/
        String actualValue = loginPage.getInputTips();
        String expectedValue = "请输入正确的手机号";
        Assert.assertEquals(actualValue,expectedValue);
    }


    @Test
    public void login_password_isnull(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("13323234545","");
        //测试步骤
        //1、输入手机号码 -为空
        /*driver.findElement(By.name("phone")).sendKeys("13323234545");
        //2、输入密码
        driver.findElement(By.name("password")).sendKeys("");
        //3、点击登录按钮
        driver.findElement(By.xpath("//button[text()='登录']")).click();*/
        //断言 -- 根据输入框的提示信息
/*        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-error-info")));
        String actualValue = webElement.getText();*/
        String actualValue = loginPage.getInputTips();
        String expectedValue = "请输入密码";
        Assert.assertEquals(actualValue,expectedValue);
    }

    @DataProvider
    public Object[][] getLoginFailureDatas(){
        Object[][] datas= {{"13323234545","","请输入密码"},
            {"158590192534","123456","请输入正确的手机号"},
            {"1585901925","123456","请输入正确的手机号"},
            {"","123456","请输入手机号"}};
        return datas;
    }

    @Test(dataProvider = "getLoginFailureDatas")
    public void login_test_failure(String mobilephone, String password, String Tips){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(mobilephone,password);
        String actualValue = loginPage.getInputTips();
        String expectedValue = Tips;
        Assert.assertEquals(actualValue,expectedValue);
        //数据驱动在web自动化里面什么时候去用？？
        //1、测试步骤一致
        //2、断言方式也一致

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
