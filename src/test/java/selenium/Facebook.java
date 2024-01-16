package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com//");
		
		Thread.sleep(300);
		
		
		
	
		WebElement searchFB=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		searchFB.sendKeys("FACEBOOK");
	
		Actions act1=new Actions(driver);

		act1.keyDown(Keys.ENTER);
		act1.keyUp(Keys.ENTER);
		act1.perform();
		
	
		
				
	}
	
	public void test() throws InterruptedException
	{
		Thread.sleep(78);
	}
}
