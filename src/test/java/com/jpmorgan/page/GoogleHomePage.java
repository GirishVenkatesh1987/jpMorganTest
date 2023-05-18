package com.jpmorgan.page;

import com.jpmorgan.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleHomePage extends Base {

    final WebDriver driver;

    @FindBy(name =  "q")
    private WebElement searchBox;

    @FindBy(xpath = "//div[@id='search']/descendant::h3")
    public List<WebElement> searchLinks;

    @FindBy(xpath = "//button[@aria-label='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//ul")
    public WebElement searchToAppear;




    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void inputTheSearchValue(String input) {
        WaitUntilElementVisible(searchBox);
        searchBox.sendKeys(input);
        WaitUntilElementVisible(searchToAppear);
        searchBox.submit();
        searchButton.click();
    }

    public void clickFirstLink(int index) {
        WaitUntilElementsVisible(searchLinks);
        if(searchLinks.size() > index) {
            searchLinks.get(index - 1).click();
        }
    }




}