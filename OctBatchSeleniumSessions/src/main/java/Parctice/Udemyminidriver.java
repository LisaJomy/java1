package Parctice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Udemyminidriver {

	public static void main(String[] args) throws InterruptedException {
		
//Give the number of counts of links on page
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Get the links count in footer section
		//Create a mini driver and use that mini driver only for the footer section
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
	//Only links in first section	
		
		WebElement columndriver	=footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		List<WebElement> links =columndriver.findElements(By.tagName("a"));
		//click on each link and check if link work
		
		//keyboard events should be sendkeys
		for(int i=1;i<links.size();i++) {
			String Keyactivities=Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(Keyactivities);
			Thread.sleep(5000);
		}
		Set<String>	windows		=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		}
			
			
		
		
		
		
	}

}
