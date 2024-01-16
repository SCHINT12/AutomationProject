package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class elementsinteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8180/pc/PolicyCenter.do");
		
		driver.findElement(By.xpath("//*[@id='Login-LoginScreen-LoginDV-username']/div/input")).sendKeys("su");
		
		Thread.sleep(3000);
		
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		driver.findElement(By.xpath("//*[@id=\"Login-LoginScreen-LoginDV-password\"]/div/input")).sendKeys("");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		

	}

}
