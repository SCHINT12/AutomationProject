package java_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy extends dummy_2{

	public void add2(int a,int b,int c)
	{
		System.out.println(a-b+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dummy d=new Dummy();
		d.add2(6, 7);
		d.add2(8, 9, 90);
		
	}

}
