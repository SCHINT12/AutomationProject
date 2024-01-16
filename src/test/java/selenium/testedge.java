package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class testedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URL = "https://demo.guru99.com/selenium/newtours/";
		
			
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		WebElement Rigister=driver.findElement(By.linkText("REGISTER"));
		Rigister.click();
		WebElement firstname=driver.findElement(By.xpath("//*[@name=\"firstName\"]"));
		firstname.sendKeys("Shiva");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("CH");
		WebElement Phone=driver.findElement(By.name("phone"));
		Phone.sendKeys("8977182936");
		WebElement Email=driver.findElement(By.id("userName"));
		Email.sendKeys("shivach310@gmail.com");
		
		Select country=new Select(driver.findElement(By.xpath("//*[@name=\"country\"]")));
		//country.selectByVisibleText("BELARUS");
		//country.selectByValue("INDIA");
		country.selectByIndex(241);
		
		
		
	
	}

}
