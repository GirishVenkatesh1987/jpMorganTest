package com.jpmorgan.steps;


import com.jpmorgan.base.Base;
import com.jpmorgan.page.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class StepsInvoker extends Base {
    private static final Logger log = LoggerFactory.getLogger(StepsInvoker.class);
    GoogleHomePage homePage = PageFactory.initElements(Base.driver, GoogleHomePage.class);



    @Given("google home page")
    public void google_home_page() {
        if(!driver.getCurrentUrl().equals(URL)) {
            driver.get("https://www.google.com/");
        }

    }
    @When("search with {string} and select the index  {string}")
    public void search_with_and_select_the_index(String searchKey, String indexToClick) {
        homePage.inputTheSearchValue(searchKey);
        homePage.clickFirstLink(Integer.parseInt(indexToClick));
    }
    @Then("Validate the title {string}")
    public void search_successful_with_valid_logo(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
    }





}

