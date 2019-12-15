package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		//element to element drag and drop
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act= new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(source,target).build().perform();
		 //how many internal actions are there-3 actions
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
	}

}
