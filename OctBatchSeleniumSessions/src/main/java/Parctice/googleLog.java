package Parctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleLog {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentyOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get("http://www.google.com");
	}

}
