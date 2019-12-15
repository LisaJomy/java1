package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
	      	WebElement month=driver.findElement(By.id("month"));
	      	WebElement day= driver.findElement(By.id("day"));
		  WebElement year=driver.findElement(By.id("year"));
	
//		Select select1= new Select(month);
//		select1.selectByVisibleText("Jul");
//		   
//		Select select2= new Select(day);
//		select2.selectByVisibleText("14");
//		
//		Select select3= new Select(year);
//		select3.selectByVisibleText("1995");
		
//		  doSelectDropDownIndex(month,5);
//		  doSelectDropDownIndex(day,5);
//		  doSelectDropDownIndex(year,6);
		  
		  //Method 3
		  doSelectDropDown(month,4);
		  doSelectDropDown(day,12);
		  doSelectDropDown(year,4);
//		Select country = new Select(driver.findElement(By.id("country")));
//		country.selectByIndex(7);
	}
//	//Method 1
//	public static void doSelectDropDown(WebElement element,String value) {
//	   Select select4= new Select(element);
//	  select4.selectByVisibleText(value);
//}
//Method 2
	
//	public static void doSelectDropDownValue(WebElement element,String value) {
//			Select select5= new Select(element);
//			select5.selectByVisibleText(value);
//	}
//		public static void doSelectDropDownIndex(WebElement element,int index) {
//		   Select select6= new Select(element);
//			  select6.selectByIndex(index);
//	
//	
//		}
//	
	//Method 3 By method overloading
	
	public static void doSelectDropDown(WebElement element,String value) {
	Select select8=new Select(element);
	select8.selectByValue(value);
	}
	public static void doSelectDropDown(WebElement element,int index) {
		Select select22=new Select(element);
		select22.selectByIndex(index);
		}
	
	
	
	
}
