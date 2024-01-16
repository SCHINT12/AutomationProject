package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test123456 {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		Register.click();
		WebElement Firstname=driver.findElement(By.name("firstName"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Firstname);
		Firstname.sendKeys("Shiva Narayana");
		WebElement Lastname=driver.findElement(By.name("lastName"));
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid black;')", Lastname);
		Lastname.sendKeys("Chintala");
		WebElement phone=driver.findElement(By.xpath("//*[@name=\"phone\"]"));
		phone.sendKeys("8977182936");
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

		TakesScreenshot ts=(TakesScreenshot)driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("c:\\Users\\shiva\\Desktop\\screen_"+timestamp+".png"));
		
		Thread.sleep(5000);
		
		driver.quit();
		

	}
	
	}

