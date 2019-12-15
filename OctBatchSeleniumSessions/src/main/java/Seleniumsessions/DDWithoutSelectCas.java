package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDWithoutSelectCas {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox1")).click();
//		List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']/child::ul/child::li/child::*"));
//		System.out.println(choicelist.size());
	//	for(int i=0;i<choicelist.size();i++) {
//		String text	=choicelist.get(i).getText();
	//		System.out.println(text);

	 // }
		
		selectDropDown(driver,"choice 1","choice 2","choice 6","choice 3","choice 4","choice 5");

	}
	public  static void selectDropDown(WebDriver driver,String... value) {
		List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']/child::ul/child::li/child::*"));
		System.out.println(choicelist.size());
		
		
	
		for(int i=0;i<choicelist.size();i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
//				if (text.equals(value)) {
//				choicelist.get(i).click();
//				break;
//				}
			//using arrays here value is the name given to the  array
			
			for(int k=0;k<value.length;k++) {
				if(text.equals(value[k])) {
					choicelist.get(i).click()	;
					break;
				}
			}

		}	
	}
		
		
	
	
	
	
	
	
	
}
