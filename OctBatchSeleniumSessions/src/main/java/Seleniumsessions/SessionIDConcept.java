package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionIDConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.inviul.com");
		
		System.out.println(driver.getTitle());
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Free Selenium Tutorials | TestNG Tutorials | Cucumber Tutorials | Inviul";
	  //  Assert.assertEquals("Condition True",actualTitle,expectedTitle);
		
//		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
//			System.out.println("Title Matched");
//		}else {
//			System.out.println("Not Matched");
//		}
		
	driver.quit();
		
		
	}

}
