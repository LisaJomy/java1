package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDWithoutSelectAssg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		
driver.findElement(By.id("justAnotherInputBox")).click();
    //Xpath based on position [position()=1]
	//div[@class='comboTreeDropDownContainer'][position()=1]//ul//li/span[@class='comboTreeItemTitle']
//	List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer'][position()=1]//ul//li/span[@class='comboTreeItemTitle']"));
//	System.out.println(choicelist.size());
//	
//	for(int i=0;i<choicelist.size();i++) {
//	String text	=choicelist.get(i).getText();
//	System.out.println(text);
//	
//		if(text.equals("choice 2")) {
//			choicelist.get(i).click();
//	       break;
//	       }
//
//	}
	selectDropDown( driver, "choice 2 3");
 }
	public  static void selectDropDown(WebDriver driver,String value) {
		List<WebElement> choicelist=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		System.out.println(choicelist.size());

		for(int i=0;i<choicelist.size();i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
				if (text.equals(value)) {
				choicelist.get(i).click();
				break;	
				}
			}
	
	}

}
