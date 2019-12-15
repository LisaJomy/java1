package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	driver.get("http://app.hubspot.com/login");
		
	Thread.sleep(5000);	
//1.By id----------------------------------Should do in this way for projects	
	
	
	//about keys.ENTER
	//WebElement email=driver.findElement(By.id("username"));	
		//email.sendKeys(Keys.ENTER);
//	WebElement pass=driver.findElement(By.id("password"));				
//		pass.sendKeys("test123");
//	WebElement login=driver.findElement(By.id("loginBtn"));	
//		login.click();
//-----------------------------------------
		
		//Locators in selenium
		//By.id,By.name,By.className,By.xpath,By.cssSelector,By.linkText,By.partialLinkText
		
	//1.By.id--1
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();
//		
	//2.By.name	--2
		
		//driver.findElement(By.name("user")).sendKeys("test@gmail.com");
		
	//3.By.xpath-- it is locator to find the element in Html Dom--3 preference
	//it is the address of the web element in html dom;
	//it is not an html attribute
//	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test123");
//	driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
//	
	
	
	
	//4.css selector:--3 preference
//	driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//	driver.findElement(By.cssSelector("#password")).sendKeys("test123");
	
	//5.className:---risky
//	driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//	driver.findElement(By.className("m-bottom-3")).sendKeys("test123");
	
	//6.link text:only for links--1st preference
	//driver.findElement(By.linkText("Sign up")).click();
	
	//7.partial link text:for links---using partial text
	
	driver.findElement(By.partialLinkText("Sign")).click();
	//if there is sign up
	//sing in --the system will be confused
	//so partiallink text is not recomended
		
	}

}
