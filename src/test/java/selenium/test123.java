package selenium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> ham=new LinkedHashMap<Integer, String>();
		ham.put(8, "Eight");
		ham.put(7, "Seven");
		ham.put(13, "thirteen");
		ham.put(6, "six");
		ham.put(5, "five");
		ham.put(4, "four");
		ham.put(3, "three");
		
		
		for(Map.Entry K:ham.entrySet())
		{
			System.out.println(K.getKey()+" "+K.getValue());
			
		}
		
		
		
		
		
	}

}
