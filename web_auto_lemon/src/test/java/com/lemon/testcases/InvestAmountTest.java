package com.lemon.testcases;

import com.lemon.common.BaseTest;
import com.lemon.config.GlobalConfig;
import com.lemon.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvestAmountTest extends BaseTest {
    String loanTitle;

    @Parameters({"browserType"})
    @BeforeMethod
    public void setup(String browserType){
        openBrowser(browserType);
        //最大化浏览器
        browserMaxmize();
        //全屏
        //driver.manage().window().fullscreen();
        //后台登录
        //driver.get(GlobalConfig.BACKSTAGE_LOGIN_URL);
        to(GlobalConfig.BACKSTAGE_LOGIN_URL);
        BackStageLoginPage backStageLoginPage = new BackStageLoginPage(driver);
        backStageLoginPage.login("lemon7","lemonbest","hapi");
        //后台添加标的
        BackStageIndexPage backStageIndexPage = new BackStageIndexPage(driver);
        loanTitle="测试"+System.currentTimeMillis();
        backStageIndexPage.addBid("13323234444",loanTitle,"8","6","500000","7","2000000","湖南长沙","白富美","25");
        //三次审核
        backStageIndexPage.verify(loanTitle);

        //加标流程实现过程中碰到的问题
        //1、iframe元素找不到，切换iframe
        //2、表格数据加载需要时间，Thread.sleep
        //3、元素被遮挡住，导致元素点击不到，最大化/全屏浏览器使得元素可见

        //前台登录
        //driver.get(GlobalConfig.FRONT_LOGIN_URL);
        to(GlobalConfig.FRONT_LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("13323234545","lemon123456");
    }

    @Test
    public void investAmountTest(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.selectBid(loanTitle);
        LoanDetailPage loanDetailPage = new LoanDetailPage(driver);
        //在投资之前获取到用户的可用余额
        String beforeLeaveAmount = loanDetailPage.getUserLeaveAmount();
        //进入到项目的详情页进行投资
        String investAmount = "200";
        loanDetailPage.invest(investAmount);
        //1、断言：根据成功的提示
        String actualValue = loanDetailPage.getInvestSuccessTips();
        Assert.assertEquals(actualValue,"投标成功！");
        //关闭投标成功的提示框
        loanDetailPage.closeInvestSuccessTips();
        //刷新浏览器
        refreshBrowser();
        //投资完毕之后的用户可用余额
        String afterLeaveAmount = loanDetailPage.getUserLeaveAmount();

        //需要补充的：还需要有其他的断言
        //作业：
        //1、用户的余额发生了变化
        double expectedValue = Double.valueOf(beforeLeaveAmount)-Double.valueOf(afterLeaveAmount);
        double actualValue2 = Double.valueOf(investAmount);
        Assert.assertEquals(actualValue2,expectedValue);
        //2、项目的可投金额发生了变化
        //3、最新投标用户显示当前投资用户信息 投资金额
        //数据库需不需要去查询？？？不需要
    }

    @AfterMethod
    public void teardown(){
        closeBrowser();
    }

    public static void main(String[] args) {
        String beforeData = "190177657.77";
        String afterData = "190179657.77";

        double a = Double.valueOf(beforeData);
        double b = Double.valueOf(afterData);
        System.out.println((int)(b-a));

    }

    /*
    * 2020-10-19 项目实战总结
    * 1、后台加标流程实现：后台登录->后台加标->标的的三次审核
    * 2、投资余额用例实现
     */


}
