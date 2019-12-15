package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		CrossBrowser obj=new CrossBrowser();
		//the right side gives me the Driver (chrome)so i can assign as WebDriver Driver
		WebDriver driver=obj.initDriver("chrome");//launch chrome
		//driver.get("http://www.google.com");
		obj.launchURL("http://app.hubspot.com/login");
		
		//page locator/page objects
		Thread.sleep(5000);
		
		By user=By.id("username");
		By pass=By.id("password");
		By login=By.id("loginBtn");
		By text=By.linkText("Sign Up");
		
		obj.getElement(user).sendKeys("test@gmail.com");
		obj.getElement(pass).sendKeys("test123");
		obj.getElement(login).click();
		obj.getElement(text).click();
		
		
		
		
		
		
		
		
		
		
//		//store it in a variable for verification purpose
//		String s=obj.getPageTitle();
//		if(s.equals("Google")){
//			System.out.println("The title is correct");
//		}else {
//			System.out.println("The title is wrong ");	
//		}
//		
		obj.closeBrowser();
//
		}
	
	//end of main method
	
public WebDriver initDriver(String browser) {
	if (browser.equals("chrome")){
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//launch browser
		}else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();//launch browser
		}else{
			System.out.println("The browser is not found");
		}
//	
//	
//	
//	driver.manage().deleteAllCookies();
//	driver.manage().window().fullscreen();
	return driver;//String revenue//WebDriver driver//driver is of the type WebDriver
//	//so return WebDriver
	
}
	
public void launchURL(String url) {
	 driver.get(url);
}

public String getPageTitle() {
  return driver.getTitle();
}

public void closeBrowser() {
	driver.quit();
}

public WebElement getElement(By locator) {
	return driver.findElement(locator);
}




	
}
