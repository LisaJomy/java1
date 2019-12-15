package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPoppupList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		//Set<String>handles=driver.getWindowHandles();
		//List is a Interface parent interface of Arraylist class	
		//Top casting	
		//Arraylist is orderbase	
		//ArrayList is child class implementing parent class(List) interface
		//We r dealing with  handles 	
	//	List<String> handleList=new ArrayList<String>(handles);
//		String parenId= handleList.get(0);
//		String childId= handleList.get(1);
//		System.out.println(parenId);
//		System.out.println(childId);
	//----------------------------------------------------------	
	//using generic method---the private method will not be called	
		
		String parenId= getWindowId( driver,0);
		String childId=getWindowId( driver,1);
		
		
		
	//-------------------------------------------------------------------	
		driver.switchTo().window(childId);
		System.out.println("child window url"+driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(parenId);
		System.out.println("parent window title"+driver.getTitle());

		driver.quit();
		

	}
	//changed public  to private
	private static List<String> getWindowId(WebDriver driver) {
		
		Set<String>handles=driver.getWindowHandles();	
		List<String> handleList=new ArrayList<String>(handles);
		return handleList;
		
		
	}
	
	public static String getWindowId(WebDriver driver,int windowid) {
List<String> HandleList1=getWindowId( driver);
return HandleList1.get(windowid);
	}

}
