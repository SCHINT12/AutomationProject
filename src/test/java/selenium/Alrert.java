package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(8000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement Alrert=driver.findElement(By.id("alertButton"));
		Alrert.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("button1 clicked");
		Thread.sleep(7000);
		
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		js.executeScript("arguments[0].click();", confirm);
		//confirm.click();
		driver.switchTo().alert().dismiss();
		System.out.println("button2 clicked");
		
		WebElement promtButton=driver.findElement(By.id("promtButton"));
		//promtButton.click();
		js.executeScript("arguments[0].click();", promtButton);
		driver.switchTo().alert().sendKeys("shiva narayana");
		driver.switchTo().alert().accept();
		System.out.println("button3 clicked");

		Thread.sleep(5000);
		driver.quit();
		System.out.println("the end");
		
	}

}
