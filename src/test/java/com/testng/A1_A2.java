package com.testng;

import org.testng.annotations.Test;

public class A1_A2 {
	
	@Test(groups= {"gropu1"})
	
	public void A1()
	{
	System.out.println("Test A1");
	}
	
	@Test(groups= {"gropu2"},enabled = false)
	
	public void A2()
	{
		System.out.println("Test A2");
	}
	
	@Test(groups= {"gropu2"})
	
	public void A3()
	{
		System.out.println("Test A3");
	}

}
