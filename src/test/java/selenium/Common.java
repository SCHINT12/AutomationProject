package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	public static WebDriver driver;
	
	public static void click(String xpath)
	{
		//driver=new ChromeDriver();
		driver.findElement(By.xpath(xpath)).click();
	}

}
