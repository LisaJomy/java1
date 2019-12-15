package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
//		Actions act=new Actions(driver);
//		
//		//Throws error if linktext is used
//		WebElement rightClickMe=driver.findElement(By.xpath("//span[text()='right click me']"));
//		//right click is known as (Context Click)
//		act.contextClick(rightClickMe).build().perform();
//		//we want to get the size of the list 
//		Thread.sleep(5000);
//		//add /span because the text is in /span
//List<WebElement> rightClickList	=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]/span"));
//	System.out.println(rightClickList.size());	
//	
//	for (int i=0;i<rightClickList.size();i++) {
//		System.out.println(rightClickList.get(i).getText());
		By locator=By.xpath("//span[text()='right click me']");
		By rightClickLocator=By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]/span");
		
		//getcountOfRightClickOptions(driver,locator,rightClickLocator);
		
		//we should call the method and to get the output printed we should assign to the arrayList Variable
		//ArrayList<String> rightClickText=
				getListOfRightClickOptions(driver,locator,rightClickLocator);
		//System.out.println(rightClickText);
	}
	
//generic method getting count only	----Method 1
	
	public  static int getcountOfRightClickOptions(WebDriver driver,By locator,By rightClickLocator) throws InterruptedException {
		
		Actions act=new Actions(driver);
		WebElement rightClickMe=driver.findElement(locator);
		act.contextClick(rightClickMe).build().perform();
		
		Thread.sleep(5000);
		
List<WebElement> rightClickList	=driver.findElements(rightClickLocator);
	System.out.println(rightClickList.size());		
	return rightClickList.size();
	}
	
//generic method to get the Text 	
public  static void getListOfRightClickOptions(WebDriver driver,By locator,By rightClickLocator) throws InterruptedException {
	//ArrayList<String> storeText=new ArrayList<String>();
	//Thread.sleep(4000);
		Actions act=new Actions(driver);
		WebElement rightClickMe=driver.findElement(locator);
		act.contextClick(rightClickMe).build().perform();
		
		Thread.sleep(5000);
		
		List<WebElement> rightClickList	=driver.findElements(rightClickLocator);
		//ArrayList<String> storeText=new ArrayList<String>();
		for (int i=0;i<rightClickList.size();i++) {
		//store the text output from the list 
		String text	=rightClickList.get(i).getText();
		System.out.println(text);
		//storeText.add(text);

}
//return text;

 }
}
