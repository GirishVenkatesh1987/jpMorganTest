package com.jpmorgan.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Base  extends Config {

    protected static WebDriver driver;

    protected void WaitUntilElementVisible(WebElement ele) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    protected void WaitUntilElementsVisible(List<WebElement> eles) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfAllElements(eles));
    }

    protected void switchToFrame(WebElement ele) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
    }

}
