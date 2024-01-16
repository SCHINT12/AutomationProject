package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		
		WebElement followall=driver.findElement(By.xpath("//*[@id=\"followall\"]"));
		followall.click();
		String parent = driver.getWindowHandle();
        Set<String> windowHandles=driver.getWindowHandles();
		
		for(String tt:windowHandles)
		{
			if(!parent.equals(tt))
			{
			driver.switchTo().window(tt);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			 
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
				
		
		
	}

}
