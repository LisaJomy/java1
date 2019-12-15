package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

driver.findElement(By.id("justAnInputBox")).click();

//List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
//	
//	
//System.out.println(choicelist.size());
//	
//	for(int i=0;i<choicelist.size();i++) {
//		String text=choicelist.get(i).getText();
//		System.out.println(text);
//		
//			if (text.equals("choice 2 3")) {
//			choicelist.get(i).click();
//			break;
//			}
//
//	}
//changed to array
//selectDropDown(driver,"choice 1","choice 2 3","choice 6","choice 5");
selectDropDown(driver,"All");
}
	
/**
 * This methos is used to select a single choice,multiple choice and all the choices	
 * @param driver
 * @param value "choice 1" Or "choice 1,choice 2" or "all"
 */
	
	
	

//if we put String... this becomes a array	
	
	public  static void selectDropDown(WebDriver driver,String... value) {
		List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		System.out.println(choicelist.size());
		
		
	if(!value[0].equalsIgnoreCase("all")) {	
		for(int i=0;i<choicelist.size();i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
//				if (text.equals(value)) {
//				choicelist.get(i).click();
//				break;
//				}
			//using arrays here value is the name of the array
			
			for(int k=0;k<value.length;k++) {
				if(text.equals(value[k])) {
					choicelist.get(i).click()	;
				}
			}

		}	
	}else
	//this will select all the values from dropdown---this one pick the list collection choicelist
	{
		try {
		for(int all=0;all<choicelist.size();all++ ) {
			choicelist.get(all).click();
	
		}//---
		}catch(Exception e) {
			
		}
		
	}
		
	}		
}
