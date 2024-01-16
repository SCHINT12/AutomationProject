package java_handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

import common.Common;

public class Test13122023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Common comn=new Common();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		WebElement Dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select sel=new Select(Dropdown);
		sel.selectByValue("option2");
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton.click();
		
		WebElement checkbox=driver.findElement(By.id("checkBoxOption2"));
		checkbox.click();
		
		WebElement Name=driver.findElement(By.name("enter-name"));
		Name.sendKeys("shiva");
		
		Thread.sleep(3000);
		
		WebElement alerttest=driver.findElement(By.id("alertbtn"));
		comn.click(alerttest);
		
		Thread.sleep(10000);

		//alerttest.click();
		driver.switchTo().alert().accept();
		
		System.out.println("done");
		
		driver.close();
		
	
		
	}

}
