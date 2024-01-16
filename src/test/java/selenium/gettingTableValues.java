package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class gettingTableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> list=driver.findElements(By.xpath("//table/tbody/tr"));
		for(WebElement e:list) {
			
			if(e.getText().contains("fjfjfjfj"))
			{
				System.out.println("Pass");
				break;
			}
			else
			{
				System.out.println("Fail");
			}
			
		//System.out.println(e.getText());
		
		
		}
			
		
		
	}

}
