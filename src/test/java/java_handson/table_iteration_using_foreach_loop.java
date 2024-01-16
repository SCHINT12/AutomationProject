package java_handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_iteration_using_foreach_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		List<WebElement> rows=driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		System.out.println("Number of rows :" +rows.size());
		
		for(WebElement e:rows)
		{
			System.out.println(e.getText());
		}

	}

}
