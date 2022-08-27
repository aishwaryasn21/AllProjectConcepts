package com.TestNGconcepts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Priority_Test {
  @Test(priority = 1,invocationCount = 1)
  public void cricket() {
	  System.out.println("Dhoni");
	  System.out.println("------------------");
  }
  @Test(priority = 0, invocationCount = 2)
  public void chess() {
	  System.out.println("Viswanathan Anand");
}
  @Test(priority=-1, invocationCount = 3)
  public void tennis() {
	  System.out.println("Sania Mirza");
}
  @BeforeSuite
  public void player() {
	  System.out.println("INDIAN PLAYERS");
}
  @AfterSuite
  public void END() {
	  System.out.println("------Topplayers-------");

}
}
