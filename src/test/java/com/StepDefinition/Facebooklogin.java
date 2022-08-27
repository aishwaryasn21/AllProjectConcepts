package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	
	public WebDriver d;

	@Given("^To Launch the Faceook page$")
	public void to_Launch_the_Faceook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SAMSUNG\\eclipse-workspace\\AllconceptsProject\\Driver\\chromedriver.exe");
		 d= new ChromeDriver();
		 d.get("https://www.facebook.com/login/");
		 System.out.println("This page is opened");
	}

	@When("^user enter the username \"([^\"]*)\"$")
	public void user_enter_the_username(String username) throws Throwable {
		d.findElement(By.id("email")).sendKeys(username);
	}

	@Then("^user enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String password) throws Throwable {
		d.findElement(By.id("pass")).sendKeys(password);

	}

	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
		d.findElement(By.name("login")).click();
	}

	@Then("^It should navigate to the home page$")
	public void it_should_navigate_to_the_home_page() throws Throwable {
		System.out.println("Facebook page is opened");
		d.close();
	}
	


}
