package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
//without opening the browser to test it
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();	
			co.addArguments("--headless");
		//very useful	
//		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new ChromeDriver(co);	//launch chrome
		driver.manage().window().fullscreen();//for full screen--complete fit with the screen
		driver.manage().deleteAllCookies();//delete catche or cookies
		driver.get("http://www.google.com");	//enter url
		String s=driver.getTitle();//title of the page	
		System.out.println(s);
		
	//verification or Checkpoint
		if(s.equals("Google")){
			System.out.println("The title is correct");
		}else {
			System.out.println("The title is wrong ");	
		}
	//get Url	
		
		System.out.println(driver.getCurrentUrl());
		
	//Close the browser automatically	
		driver.quit();
		
	}

}
