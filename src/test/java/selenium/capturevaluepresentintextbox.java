package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturevaluepresentintextbox {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8180/pc/PolicyCenter.do");
		
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.name("Login-LoginScreen-LoginDV-username"));
		username.sendKeys("su");
		String val=username.getAttribute("value");
		System.out.println("Value present in textbox as "+val);
		if(val.equals("su"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed");
		}

		
		
	

	//private TakesScreenshot webdriver;

	TakesScreenshot scrShot =((TakesScreenshot)driver);
	String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	FileHandler.copy(scrShot.getScreenshotAs(OutputType.FILE) ,new File("c:\\Users\\shiva\\Desktop\\screen_"+timestamp+".png"));
	
	
	
	
	}
}
