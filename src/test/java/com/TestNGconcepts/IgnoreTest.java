package com.TestNGconcepts;

import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void java() {
	  System.out.println("Java");
  }
  @Test(enabled = false)
 public void sel() {
	 System.out.println("Selenium");
}
  @Test
 public void pyt() {
	 System.out.println("Python");

}
}
