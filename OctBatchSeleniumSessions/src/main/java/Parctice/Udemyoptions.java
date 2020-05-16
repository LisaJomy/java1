package Parctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Udemyoptions {
//This is all about links
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		//select the option
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("checkBoxOption2")).click();
		//grab the option 2 test
		Thread.sleep(5000);
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example'] /fieldset/label[2]")).getText();
		//System.out.println(opt);
		//select the drop down and use this option text to display over there
		WebElement dropdown	=driver.findElement(By.id("dropdown-class-example"));
		Select sec=new Select(dropdown);
		sec.selectByVisibleText(opt);
		// Enter the text optin2 in the text box near alert
		driver.findElement(By.id("name")).sendKeys(opt);
		//Move to the alert and capture the text
		driver.findElement(By.id("alertbtn")).click();;
		String text	=driver.switchTo().alert().getText();
		System.out.println(text);
		if(text.contains(opt)) {
			System.out.println("Test case passed....");
		}else {
			System.out.println("Test case failed...");
		}
		
		
		
		
		
	}

}
