package com.testng;

import org.testng.annotations.Test;

public class stop_a_test {
	
@Test(enabled=false)
	
	public void a1()
	{
		System.out.println("test");
	}
	
	@Test
	
	public void z1()
	{
		System.out.println("test1");
	}

}
