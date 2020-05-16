package Parctice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUdemycarrotBeetroot {

	public static void main(String[] args) throws InterruptedException {
		int j=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		String [] itemsneeded= {"Brocolli","Cauliflower","Cucumber"};
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement>	vegetableList	=driver.findElements(By.cssSelector(".product-name"));
		System.out.println(vegetableList.size());
		Thread.sleep(5000);
		for(int i=0;i<vegetableList.size();i++) {
			String [] name=vegetableList.get(i).getText().split("-");
        String formattedName=name[0].trim();
        
			List finalList=Arrays.asList(itemsneeded);
			if(finalList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				// give the array size- so according to the number of elements added the length get calculated
				if(j==itemsneeded.length) {
					break;
				}
			}
		}
		
		
		
		
		
		
	}

}
