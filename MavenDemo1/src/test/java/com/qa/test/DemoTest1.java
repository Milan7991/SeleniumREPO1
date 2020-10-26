package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	
	@Test
	public void Sum()
	{
		System.out.println("Sum");
		int a = 5;
		int b = 7;
		Assert.assertEquals(12, a+b);
		
	}
	

	@Test
	public void Sub()
	{
	System.out.println("Sub");
		int a = 5;
		int b = 7;
		Assert.assertEquals(2, b-a);
		
	}
	

	@Test
	public void Mul()
	{
		System.out.println("Mul");
		int a = 5;
		int b = 7;
		Assert.assertEquals(35, a*b);
		
	}
}
