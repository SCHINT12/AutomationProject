package java_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_down_javascript_executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)");
		
		Thread.sleep(3000);
		
		
		//js.executeScript("scroll(0, -5250);");
		
		js.executeScript("window.scrollBy(0,-2000)");
		
		try
		
		{
			System.out.println("jfjfj");
		}
		
		finally {
			System.out.println("fhfhhfh");
		}

	}

}
