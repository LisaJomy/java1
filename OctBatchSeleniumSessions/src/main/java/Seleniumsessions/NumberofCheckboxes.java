package Seleniumsessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberofCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.spicejet.com");
//		driver.manage().window().maximize();
//	
//	
//		
//	Thread.sleep(5000);
//	System.out.println(driver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']")).size());
//		WebElement checkboxdriver=driver.findElement(By.id("discount-checkbox"));
//
//		checkboxdriver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']")).size();
//	
//		for (int i=0; i<checkboxdriver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']")).size(); i++) {
//			Thread.sleep(5000);
//	System.out.println(checkboxdriver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']")).get(i).getText());
//	//	System.out.println(text.get(i).getText());
//		}
		

	      driver.get("http://www.spicejet.com/");

	      driver.manage().window().maximize();

	      System.out.println(driver.getTitle());   

	      //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

	     // driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

	     // System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

	      Thread.sleep(4000);

	     // List<WebElement> checkboxes = driver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']"));

	      int count = driver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] [type='checkbox']")).size();

	      System.out.println(count);

	  
	      System.out.println( driver.findElement(By.id("discount-checkbox")).getText());

	
	    driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

	}
}
     
