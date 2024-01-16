package java_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@name='firstname']")));
		
		
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		WebElement CreateAccount=driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		CreateAccount.click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@name='firstname']")));
		
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Shiva");
		driver.findElement(By.name("lastname")).sendKeys("CH");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("shiva312@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("Shisve123");
		
		Thread.sleep(3000);
		

	}

}
