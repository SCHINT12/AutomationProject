package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	String name="Dinesh";
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(name);
	
	
	}
}