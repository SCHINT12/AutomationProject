//package selenium;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class mytext {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/selenium/newtours/");
//		WebElement Register=driver.findElement(By.linkText("REGISTER"));
//		Register.click();
//		WebElement Firstname=driver.findElement(By.name("firstName"));
//		String fname="shiva";
//		Firstname.sendKeys(fname);
//		driver.findElement(By.xpath("//*[@name=\"lastName\"]")).sendKeys("Ch");
//		WebElement Phone=driver.findElement(By.xpath("//*[@name=\"phone\"]"));
//		Phone.sendKeys("8977182936");
//		WebElement Email=driver.findElement(By.id("userName"));
//		Email.sendKeys("shiva.ch310@gmail.com");
//		driver.findElement(By.xpath("//*[@name=\"address1\"]")).sendKeys("11-2-47");
//		
//		Select country=new Select(driver.findElement(By.xpath("//*[@name='country']")));
//		//country.selectByVisibleText("CONGO");
//		//country.selectByValue("FALKLAND ISLANDS");
//		//country.selectByIndex(250);
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
