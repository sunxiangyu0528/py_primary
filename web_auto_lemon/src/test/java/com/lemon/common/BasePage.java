package com.lemon.common;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 所有page类的父类
 * 1、显示等待封装方法放到这里
 */
public class BasePage {
    Logger logger = Logger.getLogger(BasePage.class);
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement waitElementVisible(By by){
        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        return  webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitElementClickable(By by){
        //by变量保存的是元素的定位信息：元素的定位方式 + 元素定位值  By.xpath("//a[text()='']")
        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        return  webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitElementPresence(By by){
        WebDriverWait webDriverWait=new WebDriverWait(driver,10);
        return  webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitIframeAndSwitchToIt(By by){
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        //等待iframe元素可用 --》切换到里面
        webDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }

    //显示等待点击做二次封装
    public void click(By by){
        //点击操作的日志
        logger.info("点击了元素【"+by+"】");
        waitElementClickable(by).click();
    }

    //显示等待输入数据做二次封装
    public void input(By by,String data){
        //输入操作的日志
        logger.info("往元素【"+by+"】输入了数据【"+data+"】");
        waitElementVisible(by).sendKeys(data);
    }

    //显示等待清除输入框数据的二次封装
    public void clearInput(By by){
        logger.info("清除输入框的数据【"+by+"】");
        waitElementVisible(by).clear();
    }

    //显示等待获取元素文本做二次封装
    public String getElementText(By by){
        String text =  waitElementVisible(by).getText();
        logger.info("获取元素【"+by+"】文本【"+text+"】");
        return text;
    }

    //显示等待元素是否可见做二次封装
    public boolean isElementVisible(By by){
        try{
           /*WebDriverWait webDriverWait = new WebDriverWait(driver,10);
            WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(myAccountBy));*/
            waitElementVisible(by);
            logger.info("元素【"+by+"】是否可见【true】");
            return true;
        }catch (TimeoutException e){
            logger.error("元素【"+by+"】是否可见【false】");
            return false;
        }
    }

    //显示等待获取元素对应的属性值
    public String getAttributeValue(By by,String attributeName){
        String attributeValue = waitElementVisible(by).getAttribute(attributeName);
        logger.info("获取元素【"+by+"】属性名【"+attributeName+"】对应属性值【"+attributeValue+"】");
        return attributeValue;
    }
}
