package com.TestNGconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftTest {
  @Test
  public void softassert() {
		String s="Test NG";
		String s1="Testng";
		Assert.assertEquals(s,s1);
		System.out.println("Validation is pass");


}
}
