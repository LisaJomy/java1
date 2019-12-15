package Seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//USECASE---1
//Parent -----> 1st child
//1stchild------>2nd child
//2nd child ----->parent



public class PopUpUseCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		
	Set<String> handles		=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();
		
	String parentWindowHandle=it.next();
	System.out.println("The parent window id"+ parentWindowHandle);
	
	
	String childWindowHandle1=it.next();
	System.out.println("The child1 window id"+childWindowHandle1);
	Thread.sleep(3000);
	
	driver.switchTo().window(childWindowHandle1);
	System.out.println("The Child1 url is"+ driver.getCurrentUrl());
	driver.close();
	
	String childWindowHandle2=it.next();
	System.out.println("The child2 window id"+childWindowHandle2);
	Thread.sleep(5000);
	driver.switchTo().window(childWindowHandle2);
	System.out.println("The Child2 url is"+ driver.getCurrentUrl());
	driver.close();	
		
	driver.switchTo().window(parentWindowHandle);
	System.out.println("The parent title is"+ driver.getTitle());
	
	driver.quit();
		
	}

}
