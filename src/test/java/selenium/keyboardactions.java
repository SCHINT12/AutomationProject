package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		WebElement currentaddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
		currentaddress.sendKeys("data to be copied");
		
		Actions act=new Actions(driver);
		
		// Pressing CTRL+A
act.keyDown(Keys.CONTROL);
act.sendKeys("a");
act.keyUp(Keys.CONTROL);
act.perform();

// Pressing CTRL+C
act.keyDown(Keys.CONTROL);
act.sendKeys("c");
act.keyUp(Keys.CONTROL);
act.perform();

WebElement permaddress=driver.findElement(By.xpath("//*[@id='permanentAddress']"));

permaddress.sendKeys("");

//Pressing CTRL+V
act.keyDown(Keys.CONTROL);
act.sendKeys("v");
act.keyUp(Keys.CONTROL);
act.perform();

Thread.sleep(5000);


//CTRL+A
act.keyDown(Keys.CONTROL);
act.sendKeys("a");
act.keyUp(Keys.CONTROL);
act.perform();


//Pressing SHIFT+DEL
act.keyDown(Keys.DELETE);
act.keyUp(Keys.DELETE);
act.perform();
				
		Thread.sleep(4000);
		
		
	}

}
