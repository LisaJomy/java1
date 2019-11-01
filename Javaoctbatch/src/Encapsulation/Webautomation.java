package Encapsulation;

public class Webautomation {
	
public void launchBrowser() {
	interactWithBrowser();
}
	
	

private void interactWithBrowser() {
	checkBrowserCompatability();
	}
private void checkBrowserCompatability() {
	checkBrowserVersion();
}
	
private void checkBrowserVersion() {
	checkBrowserwithOS();
}
	
private void checkBrowserwithOS() {
	System.out.println("launching the browser");
}
	
	
	
	
	
	
}
