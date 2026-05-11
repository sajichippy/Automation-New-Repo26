package seleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	public void verifyMultipleWindow() {
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String firstWindow =driver.getWindowHandle();
	System.out.println(firstWindow);
	WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
	clickHere.click();
	Set<String> bothWindowIds  = driver.getWindowHandles();
	System.out.println(bothWindowIds);
	Iterator<String> it = bothWindowIds.iterator();
	while(it.hasNext())
	{
		String currentid = it.next();
		if(!currentid.equals(firstWindow))
		{
			driver.switchTo().window(currentid);
			WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
			email.sendKeys("abc@gmail.com");
			WebElement submitButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
			submitButton.click();
			driver.switchTo().window(firstWindow);	}
	}
	
	}

	public static void main(String[] args) {
		
		HandlingMultipleWindow window = new HandlingMultipleWindow();
		window.browserLaunch();
		window.verifyMultipleWindow();
		
	}

}
