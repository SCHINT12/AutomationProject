package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class policycreationusingtestng {
	
	static WebDriver driver;
	static String appurl;

	@Parameters({"username","password"})
@Test
	
	public void z1(String user,String pass) throws InterruptedException
	{
	WebElement username=driver.findElement(By.name("Login-LoginScreen-LoginDV-username"));
	username.sendKeys(user);
	WebElement Password=driver.findElement(By.name("Login-LoginScreen-LoginDV-password"));
	Password.sendKeys(pass);
	WebElement Login=driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-submit']"));
	Login.click();
	
	Thread.sleep(5000);
	
	}

@Parameters({"url","browser"})
@BeforeTest

public void url(String url,String browser)
{
	appurl=url;
	
	switch(browser)
	{
	
	case "chrome":
		driver=new ChromeDriver();
		break;
		
	case "edge":
		driver=new EdgeDriver();
		break;
	
		
		
	}
		

}

	
		
		
	@BeforeMethod
	public void bm() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.get(appurl);
		//appurl
		//driver.get("http://localhost:8180/pc/PolicyCenter.do");
		
		Thread.sleep(5000);

	}
	
	
	@AfterMethod
	public void am()
	{

		driver.quit();
	}


}
