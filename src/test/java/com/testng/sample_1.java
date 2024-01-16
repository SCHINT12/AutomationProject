package com.testng;

import org.testng.annotations.Test;

public class sample_1 {

@Test(groups = "group d")
	
	public void Sample1()
	
	{
		System.out.println("Sample1");
	}
	
@Test(groups = "group A" )
	
	public void Sample2()
	
	{
		System.out.println("Sample2");
	}

@Test(groups = "group d")

public void Sample3()

{
	System.out.println("Sample3");
}

@Test(priority = 87)

public void Sample4()

{
	System.out.println("Sample4");
}


@Test(groups = "group b")

public void Sample5()

{
	System.out.println("Sample5");
}


@Test(groups = "group c")

public void Sample6()

{
	System.out.println("Sample6");
}


	
	
	
	
}
