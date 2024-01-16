package java_practice;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_wait_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		
		WebElement CreateAccount=driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		CreateAccount.click();	
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Shiva");
		driver.findElement(By.name("lastname")).sendKeys("CH");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("shiva312@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("Shisve123");
		
		
		
		
		
		
		

	}

}
