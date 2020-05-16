package Parctice;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptTextBody {
	
	
	//to generate alert
	public static void generateAlert(WebDriver driver,String message) {
		
		JavascriptExecutor js9=((JavascriptExecutor)driver);	
		
		js9.executeScript("alert('"+message+"')");
	
	}
	
//scroll into view until you reach a element on the page	
//	public static void scrollIntoView(WebElement element, WebDriver driver) {
//		JavascriptExecutor js5=((JavascriptExecutor)driver);
//		js5.executeScript("arguments[0].scrollIntoview(true);", element);
//		
//	}
//Page Inner Text
//	public static String pageInnerText(WebDriver driver) {
//	
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
//		return pageText;
//	}
	//to click any button
	//WebElement interviewQ=driver.findElement(By.className("intexthighlight"));	
//	public static void clickElementByJs(WebDriver driver,WebElement element) {
//		
//		JavascriptExecutor js1=((JavascriptExecutor)driver);
//		
//		js1.executeScript("arguments[0].click();",element);
//		
//	}
	//to get the title of the page
//	public static String getTheTile(WebDriver driver) {
//		JavascriptExecutor js2=((JavascriptExecutor)driver);
//		String title=js2.executeScript("return document.title;").toString();
//		System.out.println(title);
//		return title;
//		
//	}
	//scroll the page down
//	public static void scrollPageDown(WebDriver driver) {
//		
//		JavascriptExecutor js3=((JavascriptExecutor)driver);
//		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
//		
//		
//	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");//given url
		
		String Text=driver.findElement(By.tagName("body")).getText();
		System.out.println(Text);
		
		//how to get inner text of page and generate alert
		
//		pageInnerText(driver);
		Thread.sleep(2000);
		
	//WebElement element=driver.findElement(By.id("login-signin"));	
		WebElement element=driver.findElement(By.xpath("//a[@href='https://policies.oath.com/us/en/oath/terms/otos/index.html']"));	
	
	//clickElementByJs(driver, element);
	//getTheTile( driver);
		
		//scrollPageDown( driver)	;
		
		//scrollIntoView(element,  driver);
		
		generateAlert(driver,"There is issue with Login Page");
		
	}
	
	
	
	
	
	
	
	
	

}
