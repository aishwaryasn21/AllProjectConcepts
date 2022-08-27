package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\searchhotel.feature",glue="StepDefinition\\SearchHotel.java")

public class SearchHotel {

}
