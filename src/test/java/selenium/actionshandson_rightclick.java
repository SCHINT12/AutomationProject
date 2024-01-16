package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionshandson_rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclik=driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightclik).perform();
		Thread.sleep(4000);
		

		driver.quit();

		

	}

}
