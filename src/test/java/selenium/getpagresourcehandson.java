package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagresourcehandson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/losers/bse/daily/groupa");
		
		String str=driver.getPageSource();
		System.out.println(str);
		if(str.contains("Top Losers"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		

	}

}
