package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\loginhotel.feature",
glue="com\\StepDefinition\\Hotellogin.java", monochrome=true, dryRun = false)





public class LoginHotel {

}
