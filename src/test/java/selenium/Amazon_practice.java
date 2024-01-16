package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		
		Thread.sleep(2000);
		
		Select country=new Select(driver.findElement(By.xpath("//*[@name='country']")));
		country.selectByIndex(12);
		
		

	}

}
