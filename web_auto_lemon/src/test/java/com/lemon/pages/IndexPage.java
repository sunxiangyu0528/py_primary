package com.lemon.pages;

import com.lemon.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        //调用父类的构造方法
        super(driver);
    }

    By myAccountBy = By.xpath("//a[contains(text(),'我的帐户')]");

    /*
     * 我的账户元素是否可见
     */
    public boolean isMyAccountVisible(){
        return isElementVisible(myAccountBy);
    }

    //选择对应的标
    public void selectBid(String loanTitle){
        //标的抢投标元素
        By rushToBidBy = By.xpath("//span[contains(text(),'"+loanTitle+"')]/parent::div/parent::a/following-sibling::div[1]//a[text()='抢投标']");
       click(rushToBidBy);
    }

}
