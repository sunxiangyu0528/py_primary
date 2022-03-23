package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    //构造方法解决：driver传入多次的问题
    public LoginPage(WebDriver driver){
        super(driver);
    }
    //规则：不需要一次性把所有元素定位都写上
    //在你的自动化用例需要的时候才写
    //属性  --》元素信息（定位方式+定位值）是什么类型？？
    By mobilephoneBy = By.name("phone");
    By passwordBy = By.name("password");
    By loginButtonBy = By.xpath("//button[text()='登录']");
    //页面的中间区域提示信息
    By centerTipsBy = By.className("layui-layer-content");
    //输入框的提示信息
    By inputTipsBy = By.className("form-error-info");

    //行为  -->操作
    public void login(String mobilephone,String password){
        //问题：driver驱动从哪里来？？
        //1、输入手机号码
        clearInput(mobilephoneBy);
        //waitElementVisible(mobilephoneBy).sendKeys(mobilephone);
        input(mobilephoneBy,mobilephone);
        //2、输入密码
        clearInput(passwordBy);
        //waitElementVisible(passwordBy).sendKeys(password);
        input(passwordBy,password);
        //3、点击登录
        //waitElementClickable(loginButtonBy).click();
        click(loginButtonBy);
    }

    //获取页面的中间区域提示信息 -- 》 操作
    public String getCenterTips(){
       /* WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(centerTipsBy));
        return webElement.getText();*/
        return getElementText(centerTipsBy);
    }

    //获取输入框的提示信息 -- 》 操作
    public String getInputTips(){
        /*WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(inputTipsBy));
        return webElement.getText();*/
        return getElementText(inputTipsBy);
    }
}
