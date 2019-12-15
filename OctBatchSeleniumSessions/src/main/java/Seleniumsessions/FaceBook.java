package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();
	
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
	}

}
