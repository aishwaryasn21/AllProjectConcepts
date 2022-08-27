package com.TestNGconcepts;

import org.testng.annotations.Test;

public class DependenceTest {
  @Test
  public void flip() {
	  System.out.println("Flikart");
  }
  @Test
  public void amaz() {
	  System.out.println("Amazon");
}
  @Test
  public void mees() {
	  System.out.println("Meesho");
}
  @Test(dependsOnMethods = "amaz")
  public void myn() {
	  System.out.println("Myntra");
}
}
