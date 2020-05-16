package Parctice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BhanuPratapWebtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		Thread.sleep(15000);
		
		
		List<WebElement>  rowdata= driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[1]/td"));
		System.out.println(rowdata.size());
		
		for(int i=0;i< rowdata.size();i++) {
			System.out.print(rowdata.get(i).getText()+"\t");
		}
		 
	}

}
