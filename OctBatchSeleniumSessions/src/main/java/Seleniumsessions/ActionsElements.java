package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsElements {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	//driver.get("http://app.hubspot.com/login");
	driver.get("https://classic.crmpro.com/");
	Thread.sleep(5000);
//--	WebElement username	=driver.findElement(By.name("username"));
//--	username.sendKeys("test@gmail.com");
WebElement username	=driver.findElement(By.id("username"));//.sendKeys("test@gmail.com");
//--	WebElement password=	driver.findElement(By.name("password"));
//--	password.sendKeys("test");
WebElement password=	driver.findElement(By.id("password"));//.sendKeys("test123");
	WebElement loginBtn=	driver.findElement(By.xpath("//input[@type='submit']"));
	
	//if there is a popup comming in crmpro.com it will not allow to click the login button
	//in such a situvation what to do--how to handle th loginbutton
//--	loginBtn.click();
//WebElement loginBtn=	driver.findElement(By.id("loginBtn"));//.click();
	//Another way of entering the text in text fields eithout using send keys
	//using actions class
	
//.build() i used to tell how many action we are doing--collect all the action then perform

Actions act= new Actions(driver);
//act.sendKeys(username, "test@gmail.com").build().perform();
//act.sendKeys(password, "test");
//the driver does not know where the focus is which field to enter--the webelement is not mentioned
//act.sendKeys("test@gmail.com").build().perform();//1 action send keys
//act.sendKeys("test").build().perform();
//here we mention as login button
act.click(loginBtn).build().perform();
	
	
	
	
   }	
	
}
