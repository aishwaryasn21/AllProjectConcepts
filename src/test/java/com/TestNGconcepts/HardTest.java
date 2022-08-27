package com.TestNGconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTest {
  @Test
  public void hardassert() {
		String s="Test NG";
		String s1="Test NG";
		Assert.assertEquals(s,s1);
		System.out.println("Validation is pass");
  }
   
}
