package java_handson;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_data_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");
		
		List<WebElement> rows=driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		System.out.println("Number of rows "+rows.size());
		for(WebElement row:rows )
		{
			
			System.out.println(row.getText());
			
		}
		
	
		System.out.println("page title: "+driver.getTitle());
		

	}

}
