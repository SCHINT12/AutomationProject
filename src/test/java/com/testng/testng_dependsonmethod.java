package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng_dependsonmethod {
	
@Test()
	
	public void login()
	
	{
	Assert.assertEquals(false, true);
	}
	
@Test(dependsOnMethods = "login")
	
	public void createorder()
	
	{
		System.out.println("Sample2");
	}

@Test(dependsOnMethods = "createorder")

public void submitorder()

{
	System.out.println("Sample3");
}

@Test(dependsOnMethods = "submitorder")

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
