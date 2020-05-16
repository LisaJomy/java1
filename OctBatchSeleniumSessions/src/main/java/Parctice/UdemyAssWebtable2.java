package Parctice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UdemyAssWebtable2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		
		WebElement table=driver.findElement(By.id("product"));
		//to get the row count
		List<WebElement>count=table.findElements(By.tagName("tr"));
		
		int	rowcount=count.size();
		System.out.println(rowcount);
	//to get the column count
	
		List<WebElement> Columncount=table.findElements(By.xpath("//table/tbody/tr[2]/td"));
		int	colcount=Columncount.size();
		System.out.println(colcount);
		for(int i=0; i<colcount;i++) {
		System.out.println(Columncount.get(i).getText());
	}
	
	}
	}


