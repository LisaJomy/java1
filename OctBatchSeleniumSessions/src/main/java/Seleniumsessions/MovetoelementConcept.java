package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoelementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
	// drop down with mouse actions	
		
WebElement parentMenu =driver.findElement(By.className("menulink"));
//Actions act = new Actions(driver);//n
//act.moveToElement(parentMenu).build().perform();//n
Thread.sleep(5000);
//WebElement subMenu=driver.findElement(By.linkText("COURSES"));//n
//subMenu.click();//n	
//driver.findElement(By.linkText("COURSES")).click();//n
By locator=By.linkText("COURSES");
//By parentmenuLocator=By.className("menulink");
parentMenuSubmenu( driver,parentMenu,locator);
//parentMenuSubmenu( driver,parentMenu,"COURSES");
//parentMenuSubmenu( driver,parentmenuLocator,locator);

	}
	
	
	
	
//Method overloading	
	
	//1st generic method
//Generic method to perform move to element(mouse movement--- action class)
	public static void parentMenuSubmenu(WebDriver driver,WebElement parentMenu,By locator) {
		
		Actions act = new 	Actions(driver);
		
		act.moveToElement(parentMenu).build().perform();
		//WebElement subMenu=driver.findElement(locator);	
		driver.findElement(locator).click();
		//subMenu.click();
	}
	
	// 2nd generic method-- using only by locator on child
	public static void parentMenuSubmenu(WebDriver driver,WebElement parentMenu,String submenuName) {
	
	
	Actions act = new 	Actions(driver);
	act.moveToElement(parentMenu).build().perform();
	WebElement subMenu=driver.findElement(By.linkText(submenuName));
	subMenu.click();
	
	
	}	
	//3rd generic method--using locator on both parent and child
	
	public static void parentMenuSubmenu(WebDriver driver,By parentmenuLocator,By locator) {
			
		Actions act = new Actions(driver);
		WebElement parentMenu =driver.findElement(parentmenuLocator);
		act.moveToElement(parentMenu).build().perform();
		WebElement subMenu=driver.findElement(locator);
		subMenu.click();
	
	
	}
	
	
}
