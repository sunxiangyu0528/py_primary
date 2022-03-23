package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackStageLoginPage extends BasePage {
    public BackStageLoginPage(WebDriver driver){
        super(driver);
    }
    //账号输入框
    By accountBy = By.name("admin_name");
    //密码输入框
    By passwordBy = By.name("admin_pwd");
    //验证码 --》万能验证码 hapi
    By verifyCodeBy = By.name("code");
    //登录按钮
    By loginButtonBy = By.xpath("//button[text()='登陆后台']");

    public void login(String account, String password, String verifyCode){
        waitElementVisible(accountBy).sendKeys(account);
        waitElementVisible(passwordBy).sendKeys(password);
        waitElementVisible(verifyCodeBy).sendKeys(verifyCode);
        waitElementClickable(loginButtonBy).click();
        /*driver.findElement(accountBy).sendKeys(account);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(verifyCodeBy).sendKeys(verifyCode);
        driver.findElement(loginButtonBy).click();*/
    }
}
