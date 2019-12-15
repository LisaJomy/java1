package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//without using select by valuetext,select by index how to select the drop down
public class DropDownOptions {
	//creating a generic method
	public static void selectAllDropDown(WebElement element,String value) {
		Select select=new Select(element);
		List<WebElement> SelectOptions=select.getOptions();
		System.out.println(SelectOptions.size());
		for (int i=0;i<SelectOptions.size();i++) {
		String val	=SelectOptions.get(i).getText();
			System.out.println(val);
			
			if(val.equals(value)) {
				SelectOptions.get(i).click();
				break;
			}
			
			
		}
		
		
	}
//How to find all the values in the dropdown with select class--This is done for month
	public static void displayAllDropDownvalue(WebElement element) {
		Select select=new Select(element);
		List<WebElement> SelectOptions=select.getOptions();
		System.out.println(SelectOptions.size());
		for (int i=0;i<SelectOptions.size();i++) {
		String val	=SelectOptions.get(i).getText();
			System.out.println(val);	
		}
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		WebElement month=driver.findElement(By.id("month"));
      	WebElement day= driver.findElement(By.id("day"));
	    WebElement year=driver.findElement(By.id("year"));
		// create get options and get the list
	    //then do a for loop use .get text() method to get all the text
//		Select select=new Select(day);
//		List<WebElement> days=select.getOptions();
//		System.out.println(days.size());
//		for (int i=0;i<days.size();i++) {
//		String val	=days.get(i).getText();
//			System.out.println(val);
//			
//			if(val.equals("10")) {
//				days.get(i).click();
//				break;
//			}
//			
//			
//		}
//	    selectAllDropDown(day,"10");
//	    selectAllDropDown(month,"Jul");
//	    selectAllDropDown(year,"2005");
//		
	    displayAllDropDownvalue(month);
	}


}
