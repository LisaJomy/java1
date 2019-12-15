package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethod {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	
	driver.get("http://www.google.com");
	driver.navigate().to("http://www.amazon.com");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().back();
	//to refresh the page
	driver.navigate().refresh();
		
	}

}
