package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationpopupalert {

	public static void main(String[] args) {
		//authentication pop up will have some data to enter
		//they will apper as soon as the page appears--we need not click anything 
		//for them to appear
		
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		//we have to pass the username and password with url
		
	//	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");	
	//Generic method
		String username="admin";
		String password="admin";
		
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
	}

}
