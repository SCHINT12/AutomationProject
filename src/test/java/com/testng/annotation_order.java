package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation_order {
	
@Test
	
	public void z1()
	{
		System.out.println("test");
	}
@Test

public void z2()
{
	System.out.println("test1");
}

	
	@BeforeSuite
	
	public void bs()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");

	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");

	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");

	}
	
@AfterSuite
	
	public void as()
	{
	System.out.println("after suite");

	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after test");

	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class");

	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("after method");

	}
	

	

}
