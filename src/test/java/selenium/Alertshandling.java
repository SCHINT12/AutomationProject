package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement AlertButton=driver.findElement(By.id("alertButton"));
		AlertButton.click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		WebElement confirmButton=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		js.executeScript("arguments[0].click();", confirmButton);
		//confirmButton.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		WebElement promtButton=driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		promtButton.click();
		driver.switchTo().alert().sendKeys("shiva narayana");
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
