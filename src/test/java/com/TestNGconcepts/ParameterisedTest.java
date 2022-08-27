package com.TestNGconcepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {
  @Test
  @Parameters({"username","password"})
  public void login(@Optional("abc")String username, String password) {
	  System.out.println("Username: "+username);
	  System.out.println("Password: "+password);
  }
}
