package Parctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicelocator {

	public static void main(String[] args) throws InterruptedException {
		CrossBrowserTesting obj= new CrossBrowserTesting();
		obj.intiateDrivers("chrome");
		
        obj.launchURL("http://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//by locator:byobjects
		By emailid=By.id("username");
        By password =By.id("password");
        By loginBtn=By.id("loginBtn");
        By signup=By.linkText("Sign up");
        
        CrossBrowserTesting obj1= new CrossBrowserTesting();
        
        
        obj1.getElement(emailid).sendKeys("test@gmail.com");
        obj1.getElement(password).sendKeys("test");
        obj1.getElement(loginBtn).click();
        obj1.getElement(signup).click();
        
        obj1.closeBrowser();
        
        
        
        
	}

}
