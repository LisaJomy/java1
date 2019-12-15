package Seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertJSpopup {

	public static void main(String[] args) throws InterruptedException {
	//javaScrip popup	
	//popup is not a webelement	
		//ALERT
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
WebElement go=driver.findElement(By.name("proceed"));
	go.click();//click on go button
	Thread.sleep(2000);
Alert alert	=driver.switchTo().alert();
//there is a method to capture the text in the alert
String a1=alert.getText();
System.out.println(a1);
if (a1.equals("Please enter a valid user name")) {
	System.out.println("Correct");
}else {
	System.out.println("Wrong");
}

alert.accept();//to click the ok button
//alert.dismiss();//to click the cancel button
	}

}
