package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionshandson_mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.highradius.com/");
		WebElement products=driver.findElement(By.xpath("//*[text()='Products']"));
		Actions act=new Actions(driver);
		act.moveToElement(products).perform();
		Thread.sleep(4000);
		WebElement ordertocash=driver.findElement(By.xpath("//*[text()='Order']"));
		act.moveToElement(ordertocash).perform();
		Thread.sleep(4000);
		WebElement electronicInvoicing=driver.findElement(By.xpath("//*[text()='Electronic Invoicing ']"));
		act.moveToElement(electronicInvoicing).perform();
		Thread.sleep(5000);
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),'serve payment portals')]"));
        String str=text.getText();
        System.out.println(str);
        System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
