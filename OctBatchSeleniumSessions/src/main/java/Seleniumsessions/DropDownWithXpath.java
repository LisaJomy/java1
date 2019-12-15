package Seleniumsessions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
	//no need of the path of the webelements
//	   
//	   List<WebElement> optionlist=driver.findElements(By.xpath("//select[@id='month']/option"));
//	   System.out.println(optionlist.size());
//	   for(int i = 0;i<optionlist.size();i++) {
//		   System.out.println(optionlist.get(i).getText());
//	   }
	  //by.locator 
By month=By.xpath("//select[@id='month']/option") ;  
	   //this getDropDownValues method returns ArrayList so store in ArrayList
ArrayList<String> months=getDropDownValues( driver,month) ;
	System.out.println(months);   
	}

	
public static ArrayList<String> getDropDownValues(WebDriver driver,By locator)	{
	ArrayList<String> ar=new ArrayList<String>();
	 List<WebElement> optionlist=driver.findElements(locator);
	   System.out.println(optionlist.size());
	   for(int i = 0;i<optionlist.size();i++) {
	String val=optionlist.get(i).getText();
		   
	ar.add(val);   
		   
	}	
	return ar;
	
}
	
	
	
	
	
}
