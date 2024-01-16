package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector_handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		// Css selector syntax
		  
		//                 tagname[attribute='value']
		//                  input[id='userName']
		// for id(#)        if id='userName'           input#userName
		// for classname(.) if class='userName'        input.userName
		
		//WebElement firstname=driver.findElement(By.cssSelector("input#userName"));
		WebElement firstname=driver.findElement(By.cssSelector("input. mr-sm-2 form-control"));
		
		firstname.sendKeys("shiva");
		WebElement email=driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("shiva310@gmail.com");
		

	}

}
