package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\loginfacebook.feature", 
                 glue="src\\test\\java\\com\\fbdefinition\\loginfb.java")

public class fblogin {

}
