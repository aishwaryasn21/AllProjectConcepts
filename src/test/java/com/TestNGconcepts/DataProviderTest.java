package com.TestNGconcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider = "login")
  public void loginfunction(String username, String password) {
	  System.out.println("Username :"+username);
	  System.out.println("Password :"+password);
  }
  @DataProvider
  private Object[][] login() {
	return new Object[][] {{"usename1@gmail.com","abc123"},
		{"usrname2@gmail.com", "data456"},{"username3@gmail.com","dummy123"}};
	
	  

}
  
}
