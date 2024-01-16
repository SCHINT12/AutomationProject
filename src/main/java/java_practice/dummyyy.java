package java_practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dummyyy {
	
	public static void main(String[] args) throws InterruptedException {
		
		String name="shiva narayana";
		String Reversname="";
		int len=name.length();
		
		for (int i=len-1;i>=0;i--)
		{
			
			Reversname=Reversname+name.charAt(i);
			
			System.out.println(Reversname);
		}
		
		
		//i=i+2  i+=2
		System.out.println(Reversname);
		
		//2 4 6 8 100
		
		
		for(int i=0;i<=100;i+=2)
		{
			System.out.println(i);
			
		}
		
	}

}
