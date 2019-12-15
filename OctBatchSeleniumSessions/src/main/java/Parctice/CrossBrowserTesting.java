package Parctice;
import org.openqa.selenium.By;
//Generic methods
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Generic method to launch the browser--by providing the browser
public class CrossBrowserTesting {
	public static WebDriver driver;

	public static void main(String[] args) {
		CrossBrowserTesting obj= new CrossBrowserTesting();
obj.intiateDrivers("chrome");
driver.manage().deleteAllCookies();
driver.manage().window().fullscreen();
//driver.get("http://www.google.com");
obj.launchURL("http://www.google.com");
//String title=driver.getTitle();
String title=obj.pageTitle();
System.out.println(title);
obj.closeBrowser();


	}
public WebDriver intiateDrivers(String browser) {
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();	
	     driver=new ChromeDriver();
	}else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();	
	     driver=new FirefoxDriver();
	}else {
	System.out.println("Entered a wrong browser");	
	}
	return driver;
	}

public void launchURL(String url) {
	driver.get(url);
	
}
public String pageTitle() {
	return driver.getTitle();
}

public void closeBrowser() {
	driver.quit();
}

//Browser related coding over
//General method for locators
public WebElement getElement(By locator) {
return driver.findElement(locator);	
}




}
