package com.TestNGconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	WebDriver driver;
  @Test
  public void hotellogin() {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SAMSUNG\\eclipse-workspace\\AllconceptsProject\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://adactinhotelapp.com/");
		WebElement name =driver.findElement(By.id("username"));
		name.sendKeys("Aishsuriya");
		WebElement psd=driver.findElement(By.id("password"));
		psd.sendKeys("dummy@2022");
		driver.findElement(By.id("login")).click();
		System.out.println("Hotelpage is opened");
		WebElement profilename = driver.findElement(By.name("username_show"));
//		profilename.equals(name);
    	Assert.assertEquals(name,profilename);
		System.out.println("Validation is pass");
		

  }
}
