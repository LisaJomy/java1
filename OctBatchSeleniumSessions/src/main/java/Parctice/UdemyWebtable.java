package Parctice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UdemyWebtable {

	public static void main(String[] args) throws InterruptedException {
	//Vedios-97-100
		int sum=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table=driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> thirdElement	= table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		
		System.out.println(thirdElement.size());
	
		for(int i=0;i<thirdElement.size()-2;i++) {
		String value =thirdElement.get(i).getText();
		int totalvalue=Integer.parseInt(value);
		sum=sum+totalvalue;
		}
	
		String text=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		//System.out.println(text);
		int totalsum1=sum+Integer.parseInt(text); 
		System.out.println(totalsum1);
		
		
		String totalScore=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int finalscore=Integer.parseInt(totalScore);
		if (finalscore==totalsum1){
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed...");
		}
	
	}

}
