package java_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> Table=driver.findElements(By.xpath("//table/tbody/tr"));
		
//		for(WebElement t:Table)
//		{
//			if(t.getText().contains("D"))
//			System.out.println(t.getText());
//		}
		
		int size=Table.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(Table.get(i).getText());
		}
		
		
		
		
		
		

	}

}
