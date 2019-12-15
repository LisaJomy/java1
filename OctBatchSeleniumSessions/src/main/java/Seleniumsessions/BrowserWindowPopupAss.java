package Seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopupAss {
	
	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();	
WebDriver driver=new ChromeDriver();	
driver.get("http://www.popuptest.com/goodpopups.html");


driver.findElement(By.linkText("Good PopUp #3")).click();
		
//Set<String>handles=driver.getWindowHandles();
//Iterator<String> it=handles.iterator();

//String parentWindowhandle=it.next();
//System.out.println(parentWindowhandle);

//String childWindowhandle=it.next();
//System.out.println("child window id"+childWindowhandle);

String parentId =swithcToUsingId(driver,0);
String childId=swithcToUsingId(driver,1);


driver.switchTo().window(childId);
System.out.println("child window url"+driver.getCurrentUrl());

driver.close();

driver.switchTo().window(parentId);
System.out.println("parent window title"+driver.getTitle());

driver.quit();


	}
private static List<String> getWindowHandles(WebDriver driver) {
		Set<String>handles=driver.getWindowHandles();	
		List<String> handleList= new ArrayList<String>(handles);
		return  handleList;
		
	}
	
public static String swithcToUsingId(WebDriver driver,int windowId) {
		List<String> winId=getWindowHandles( driver);
		return winId.get(windowId);
	}
	
}
