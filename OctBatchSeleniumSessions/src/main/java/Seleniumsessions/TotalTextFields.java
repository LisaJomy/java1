package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalTextFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//pick out the type = text to refer to text fields
//		List<WebElement> text=driver.findElements(By.xpath("//input[@type='text']"));
//		//gives number of textfields in a particular page
//		System.out.println(text.size());
		//pick out the radio buttons
		List<WebElement> text=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(text.size());
		
		
		
		
		
	}

}
