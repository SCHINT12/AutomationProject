package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_dependsongroups {
	
@Test(groups= {"A"})
	
	public void login()
	
	{
	Assert.assertEquals(false, true);
	}
	
@Test(dependsOnGroups = "A",groups= {"B"})
	
	public void createorder()
	
	{
		System.out.println("Sample2");
	}

@Test(dependsOnGroups = "B")

public void submitorder()

{
	System.out.println("Sample3");
}

@Test()

public void logout()

{
	System.out.println("Sample4");
}


@Test()

public void Sample5()

{
	System.out.println("Sample5");
}

}
