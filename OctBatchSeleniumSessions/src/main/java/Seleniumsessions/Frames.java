package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
//if by notmal method if you get NoSuchElementFoundException check wheather the element is on a frame
//		right click you will see "View Frame Source"
//		go to the frame----do in ordinary method first --then if it is frame then use switch to command
	//	1st method
		//driver.switchTo().frame(2);
		//2nd method--check for id or name attribute
		//driver.switchTo().frame("main");//name attribute is used here
//		 interact with the webelement in the frame
		//3rd method  //frameelement
		List<WebElement> framelist=driver.findElements(By.tagName("frame"));
		System.out.println(framelist.size());
		//validate
		if(framelist.size()>0) {
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		WebElement header=driver.findElement(By.xpath("//h2[text()='Title bar ']"));
//		
		System.out.println(header.getText());
		driver.switchTo().defaultContent()	;
		//new method
		//driver.switchTo().parentFrame();//1st frame
		
		}else{
			System.out.println("Frame is not present");
		}
		
	//according to w3 is not recomended	
	}

}
