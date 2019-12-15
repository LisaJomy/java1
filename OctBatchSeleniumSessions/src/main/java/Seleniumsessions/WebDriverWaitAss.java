package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitAss {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.titleContains("HubSpot"));
		w.until(ExpectedConditions.urlContains("login"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		By emailId=By.id("username");
		By pwd=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		w.until(ExpectedConditions.presenceOfElementLocated(emailId));
		
		driver.findElement(emailId).sendKeys("lisa_k_y@yahoo.com");
		driver.findElement(pwd).sendKeys("Pudukad@123");
		driver.findElement(loginBtn).click();
		
		
		
		
		
	}

}
