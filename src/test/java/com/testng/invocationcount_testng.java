package com.testng;

import org.testng.annotations.Test;

public class invocationcount_testng {
	
@Test(invocationCount = 25)
	
	public void z1()
	{
		System.out.println("test");
	}


}
