package com.jpmorgan.steps;


import com.jpmorgan.base.Base;
import com.jpmorgan.page.GoogleHomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
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


public class Hooks extends Base {
    private static final Logger log = LoggerFactory.getLogger(Hooks.class);
    GoogleHomePage homePage = PageFactory.initElements(Base.driver, GoogleHomePage.class);


    @BeforeAll
    public static void beforeTestStart() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void afterAllTest() {
        driver.close();
        driver.quit();
    }

    @Before
    public void beforeEachScenrio() {

        driver.get(URL);

    }






}

