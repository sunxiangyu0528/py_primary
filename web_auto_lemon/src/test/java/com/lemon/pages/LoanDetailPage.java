package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanDetailPage extends BasePage {
    public LoanDetailPage(WebDriver driver){
        super(driver);
    }
    //投资金额的输入框
    By investAmountInputBy = By.className("invest-unit-investinput");
    //投标按钮
    By investButtonBy = By.xpath("//button[text()='投标']");
    //投标成功提示
    By investSuccessTipsBy = By.xpath("//div[text()='投标成功！']");
    //投标成功提示框关闭按钮
    By closeInvestSuccessBy = By.xpath("//div[text()='投标成功！']/preceding-sibling::div/img");

    //投资的操作
    public void invest(String investAmount){
        input(investAmountInputBy,investAmount);
        click(investButtonBy);
    }

    //获取到投资成功提示的操作
    public String getInvestSuccessTips(){
        return getElementText(investSuccessTipsBy);
    }

    //关闭投资成功提示框
    public void closeInvestSuccessTips(){
//        waitElementClickable(closeInvestSuccessBy).click();
        click(closeInvestSuccessBy);
    }

    //获取到用户可用余额
    public String getUserLeaveAmount(){
//        return waitElementVisible(investAmountInputBy).getAttribute("data-amount");
        return getAttributeValue(investAmountInputBy,"data-amount");
    }


}
