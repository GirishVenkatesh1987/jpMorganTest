package com.jpmorgan.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        tags = "@Sanity",
        glue = {"classpath:com/jpmorgan/steps"},
        plugin = {"pretty", "html:target/cucumber/report.html"})
public class FeatureRunner {

}