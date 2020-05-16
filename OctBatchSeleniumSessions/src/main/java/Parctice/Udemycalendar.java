package Parctice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Udemycalendar {
//Vedio 92-94
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(5000);
		//click the next button until april equals april
	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().equals("April"));
	{
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();;
	}
		
		
		
	// To select only the day	
List<WebElement> list=driver.findElements(By.className("day"));
System.out.println(list.size());
//for(int i=0;i<list.size();i++) {
//	String text	=list.get(i).getText();
//	//System.out.println(text);
//	if(text.equalsIgnoreCase("23")) {
//	list.get(i).click();
//	break;
//	}
//	
// }
}

}
