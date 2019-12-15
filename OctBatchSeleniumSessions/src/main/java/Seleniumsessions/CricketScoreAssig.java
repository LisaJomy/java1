package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreAssig {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.espncricinfo.com/series/19297/scorecard/1187671/new-zealand-vs-england-1st-test-england-in-new-zealand-2019-20");

		
	//List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='TWM Latham']
		//parent::div//following-sibling::div[(contains(@class, 'cell highlight active'))=false]"));
//	  System.out.println(scoreList);
//		for(int i=0;i<scoreList.size();i++) {
//		String score=scoreList.get(i).getText();
//		System.out.println(score);
//
//		}
		getScoreCardList(driver,"JA Raval");
		getScoreCardList( driver,"TWM Latham");
		getScoreCardList( driver,"KS Williamson (c)");
		getScoreCardList(driver,"LRPL Taylor");
		getScoreCardList(driver,"HM Nicholls");
		getScoreCardList(driver,"BJ Watling †");
		
		
	}
public static void getScoreCardList(WebDriver driver,String playerName) {
	System.out.print(playerName+" \t");
List<WebElement> scoreList=driver.findElements(By.xpath("//a[text()='"+playerName+"']"
		+ "//parent::div//following-sibling::div[(contains(@class, 'cell highlight active'))=false]"));

//System.out.println(scoreList.size());
	for(int i=0;i<scoreList.size();i++) {
		String score=scoreList.get(i).getText();
		System.out.print( score+ "   ");
		}
	System.out.println();
}

	}
	
	

