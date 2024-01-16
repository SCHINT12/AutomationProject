package com.testng;

import org.testng.annotations.Test;

public class grouping_testcases {
	
	

	
@Test(groups= {"smoketest"})
	
	public void z1()
	{
		System.out.println("test z1");
	}
@Test(groups= {"E2E tests"})

public void z2()
{
	System.out.println("test z2");
}

@Test(groups= {"sanity tests"})

public void z5()
{
	System.out.println("test z5");
}
@Test(groups= {"sanity tests"})

public void z3()
{
System.out.println("test z3");
}

@Test(groups= {"smoketest"})

public void z6()
{
	System.out.println("test z6");
}
@Test(groups= {"sanity tests"})

public void ab()
{
System.out.println("test ab");
}





}
