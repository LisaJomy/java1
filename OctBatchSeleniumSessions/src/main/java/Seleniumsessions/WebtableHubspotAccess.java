package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHubspotAccess {

	public static void main(String[] args) throws InterruptedException {
		//https://app.hubspot.com/demo-tour/6768342/contacts/list/view/all?flowId=new-ic&tourId=filter-new-lead
		
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	//	driver.findElement(By.linkText("Sign in with Google")).click();
		driver.findElement(By.id("username")).sendKeys("lisa_k_y@yahoo.com");
		//driver.findElement(By.className("RveJvd")).click();
		driver.findElement(By.id("password")).sendKeys("Pudukad@123");
//		
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Restart demo")).click();
	//driver.findElement(By.className("private-clickable private-close__button uiDialog-closeButton private-modal__control private-modal__close UIDialogCloseButton__CloseButton-fQOyIV kSgkNP UICloseButton__CloseButton-bDPSxA gozwhw UIDialogButton__DialogButton-jxlvsj private-modal__control kFspDf UIClickable-hyyfMk lcBeMa")).click();
	driver.navigate().to("https://app.hubspot.com/demo-tour/6768690/contacts/list/view/all?flowId=new-ic&tourId=filter-new-lead");
	Thread.sleep(5000);
	//String checkbox="//a[text()='Gareth Campion']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']";
	//driver.findElement(By.xpath("//a[text()='Gareth Campion']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']")).click();
	selectWebTableCheckBox(driver,"Gareth Campion");
	selectWebTableCheckBox(driver,"Jason Siegfried");
	Thread.sleep(5000);
	selectWebTableCheckBox(driver,"Parker Crain");
	Thread.sleep(5000);//write explicit exception and see
	
	selectWebTableCheckBox(driver,"Kelly Cathcart");
	}
	
	//Generic method
	
	public static void selectWebTableCheckBox(WebDriver driver,String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']")).click();
	}
	
	
	
	
	

}
