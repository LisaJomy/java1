package Seleniumsessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		//http://newtours.demoaut.com/
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		
List <WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
	for(int i =0;i<links.size();i++) {
	WebElement  link   =links.get(i);
	
	//href property we get url of each link--getAttribute
	String url=link.getAttribute("href");
	//create object of url
	
	URL link1=new URL(url);
	
	//Establish connect  ---class used to check wheather the link is conncting in the target page
	HttpURLConnection httpconn=(HttpURLConnection)link1.openConnection();
	
	Thread.sleep(2000);
	
	httpconn.connect();
	//this connection will return the response code
int response	=httpconn.getResponseCode();
	
	
	if(response>=400) {
		System.out.println(url+"  "+"is a broken link");
		
	}else {
		
		
	System.out.println(url+"  "+"is a valid link");	
		
	}
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		

	}

}
