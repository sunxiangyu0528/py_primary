package com.lemon.testcases;

import com.lemon.common.BaseTest;
import com.lemon.config.GlobalConfig;
import com.lemon.listener.TestRetry;
import com.lemon.pages.IndexPage;
import com.lemon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestV3 extends BaseTest {

    @Parameters({"browserType","browserVersion"})
    @BeforeMethod
    public void setupClass(String browser,String browserVersion){
        //前置
        //前置条件：进入到登录页面
        openBrowser(browser);
        System.out.println(browserVersion);
//        driver.get(GlobalConfig.FRONT_LOGIN_URL);
        to(GlobalConfig.FRONT_LOGIN_URL);
    }

    /*
     * 登录的正常功能验证
     */
    @Test(enabled = false)
    public void login_sucesss(){
        //实例化登录页面对象
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("13323234545","lemon123456");
        IndexPage indexPage = new IndexPage(driver);
        Assert.assertTrue(indexPage.isMyAccountVisible());
        String expectedUrl="http://120.78.128.25:8765/Index/index";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    /*
     * 用户账号未注册进行登录
     */
    @Test(enabled = false)
    public void login_mobilephone_unregister(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("15859019266","123456");
        String actualValue = loginPage.getCenterTips();
        String expectedValue = "此账号没有经过授权，请联系管理员!";
        Assert.assertEquals(actualValue,expectedValue);
    }

    @DataProvider
    public Object[][] getLoginFailureDatas(){
        Object[][] datas= {{"13323234545","","请输入密码AA"},
            {"158590192534","123456","请输入正确的手机号"},
            {"1585901925","123456","请输入正确的手机号BB"},
            {"","123456","请输入手机号"}};
        return datas;
    }

    @Test(dataProvider = "getLoginFailureDatas")
    public void login_test_failure(String mobilephone, String password, String Tips){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(mobilephone,password);
        String actualValue = loginPage.getInputTips();
        String expectedValue = Tips;
        Assert.assertEquals(actualValue,expectedValue);
    }


    @AfterMethod
    public void teardownMethod(){
        //用例后置，测试结束后-关闭浏览器
        closeBrowser();
    }

}
