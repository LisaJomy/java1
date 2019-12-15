package Seleniumsessions;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//USECASE2
//parent--->child1
// child1---> parent
//parent ---->child2
//child2--->parent
public class PopUpUseCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.popuptest.com/goodpopups.html");


		driver.findElement(By.linkText("Good PopUp #3")).click();
	
Set<String>handles=driver.getWindowHandles();

Iterator<String> it=handles.iterator();
Thread.sleep(5000);
String parentWindowhandle=it.next();
System.out.println("Parent window"+parentWindowhandle);
Thread.sleep(5000);
String childWindowhandle1=it.next();
System.out.println("child window id: "+childWindowhandle1);

Thread.sleep(5000);
driver.switchTo().window(childWindowhandle1);
System.out.println("child1 window url: "+driver.getCurrentUrl());

driver.close();
driver.switchTo().window(parentWindowhandle);
System.out.println("parent window url: "+driver.getCurrentUrl());

	driver.findElement(By.linkText("Good PopUp #4")).click();

Set<String>handles1=driver.getWindowHandles();
Iterator<String> it2=handles1.iterator();
Thread.sleep(5000);
String parentWindowhandle2=it2.next();
System.out.println("parent window"+parentWindowhandle2);
String childWindowhandle2=it2.next();
System.out.println("child2 window id: "+childWindowhandle2);
driver.switchTo().window(childWindowhandle2);
System.out.println("child2 url: "+driver.getCurrentUrl());
driver.close();
driver.switchTo().window(parentWindowhandle2);
System.out.println("parent window url: "+driver.getCurrentUrl());
driver.quit();

	}

}
