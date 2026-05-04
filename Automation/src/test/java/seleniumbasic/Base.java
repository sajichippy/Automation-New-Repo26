package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; // globally declare and WebDriver declaration // webriver is a interface so we cant create object of a interface 
	
	public void browserLaunch(){
		
		driver = new ChromeDriver();  // implemented class // ChromeDriver implements WebDriver //So it provides all the actual functionality
		                                    
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void browserCloseAndQuit() {
	//	driver.close();
		driver.quit();
	}
	
	

	public static void main(String[] args) {
		Base base = new Base ();
		base.browserLaunch();
		base.browserCloseAndQuit();

	}

}
