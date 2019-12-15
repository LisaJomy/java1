package Seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Total Links


public class TextLinks {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		// Link count -using driver.find elements by.tagname method
		//the output is a list of webelement
		
	List<WebElement> linksList	=
			driver.findElements(By.tagName("a"));
	//System.out.println(linksList.size());	//linksList.size()	 
	

	
		
	//for(int i=0;i<linksList.size()-1;i++) {	
		//.get.getText() to get the text of all the links
	//String val	=linksList.get(i).getText();
	
	
	//if(!val.isEmpty()) {
	//	System.out.println(i+"--->"+val);
	//}
	
	//capture href or url values for each link
	
	//get().getAttribute("href")
	//System.out.println(linksList.get(i).getAttribute("href"));
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
	}
//}
