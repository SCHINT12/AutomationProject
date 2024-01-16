package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class linktext_partiallinktext {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/newtours/register.php");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		//fluent wait
		
		Wait wait = new FluentWait(WebDriver reference)
				.withTimeout(timeout, SECONDS)
				.pollingEvery(timeout, SECONDS)
				.ignoring(Exception.class);
		
		//WebElement Flights=driver.findElement(By.linkText("Flights"));
		//WebElement Flights=driver.findElement(By.partialLinkText("Fligh"));
		//WebElement Flights=driver.findElement(By.xpath("//*[text()='Flights']"));
		List<WebElement> Flights=driver.findElements(By.xpath("//*[contains(text(),'Flights')]"));
		System.out.println(Flights.size());
		//Flights.click();
		

	}

}
