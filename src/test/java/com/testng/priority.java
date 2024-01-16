package com.testng;

import org.testng.annotations.Test;

public class priority {
	
	
@Test(priority = -5)
	
	public void z1()
	{
		System.out.println("test z1");
	}
@Test

public void z2()
{
	System.out.println("test z2");
}

@Test(priority = 100)

public void z5()
{
	System.out.println("test z5");
}
@Test(priority = -234)

public void z3()
{
System.out.println("test z3");
}

@Test(priority = 1567)

public void z6()
{
	System.out.println("test z6");
}
@Test

public void ab()
{
System.out.println("test ab");
}


}
