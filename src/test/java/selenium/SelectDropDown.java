package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("secret_sauce");
		WebElement Login=driver.findElement(By.id("login-button"));
		Login.click();
		
		//Selecting the dropdown
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@data-test='product_sort_container']")));
		
		
		//Thread.sleep(15000);
		
		
		//Getting all values present in the dropdown
		//driver.navigate().refresh();
		//Get all options
	    List<WebElement> dd = dropdown.getOptions();

	    //Get the length
	    System.out.println(dd.size());

	    // Loop to print one by one
	    for (int j = 0; j < dd.size(); j++) {
	        System.out.println(dd.get(j).getText());

	    }
		
	  dropdown.selectByValue("lohi");
		
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println("Title of the page : "  +actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title is getting displayed as expected as Title: "+expectedTitle);
		}
		else
		{
			System.out.println("Title is not getting displayed as expected");

		}
		
		Thread.sleep(5000);
		//driver.quit();
		
		
	}

}
