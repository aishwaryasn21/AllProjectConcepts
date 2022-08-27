package com.TestNGconcepts;

import org.testng.annotations.Test;

public class GroupTest {
	 @Test(groups = "E-Commerce")
	  public void flip() {
		  System.out.println("Flipkart");
	  }
	  @Test(groups = "E-Commerce")
	  public void amaz() {
		  System.out.println("Amazon");
	}
	  @Test(groups = "E-Commerce")
	  public void mees() {
		  System.out.println("Meesho");
	}
	  @Test(groups = "E-Commerce")
	  public void myn() {
		  System.out.println("Myntra");
	}
	  @Test(groups = "UPI")
	  public void pay() {
		  System.out.println("PayTM");
	  }
	  @Test(groups = "UPI")
	  public void gpay() {
		  System.out.println("GooglePay");
	}
	  @Test(groups = "UPI")
	  public void phon() {
		  System.out.println("PhonePe");
	}
	  @Test(groups = "UPI")
	  public void bhi() {
		  System.out.println("BHIM");
	}
}
