package com.TestNGconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simpletest {
	
  @Test
  public void name1() {
	  System.out.println("Sara - Ist");
  }
  @Test
  public void name2() {
	  System.out.println("Priya - IInd");
}
  @Test
  public void name3() {
	  System.out.println("Arun - IIIrd");
}
  @BeforeMethod
  public void college() {
	  System.out.println("SRM");
}
  @AfterMethod
  public void city() {
	  System.out.println("Chennai");
}
  @BeforeSuite
  public void dep() {
	  System.out.println("Information Technology");
}
  @BeforeTest
  public void batch() {
	  System.out.println("Year2021");
}
  @BeforeClass
  public void top() {
	  System.out.println("Toppers");
}
  @AfterSuite
  public void country() {
	  System.out.println("INDIA");
}
  @AfterTest
  public void state() {
	  System.out.println("TAMLNADU");
}
  @AfterClass
  public void district() {
	  System.out.println("Kanchipuram");

}
}
