package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlterHandling extends Base {
	
	public void verifySimpleAlter() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleClickMe = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleClickMe.click();
		Alert al = driver.switchTo().alert();		
		al.accept();
		
	}
	
   public void verifyConfirmAlert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirmOK = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirmOK.click();
	Alert al = driver.switchTo().alert();		
	al.accept();
	al.dismiss();	
}
   public void verifyPromptAlert() {
	   driver.navigate().to("https://demoqa.com/alerts");
	   WebElement promptButton =  driver.findElement(By.xpath("//button[@id='promtButton']"));
	   promptButton.click();
	   Alert al = driver.switchTo().alert();	
       al.sendKeys("Chippy");
       al.accept();
 	   
	   
	   }
	public static void main(String[] args) {
		AlterHandling alert = new AlterHandling();
		alert.browserLaunch();
	//	alert.verifySimpleAlter();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
		
	
	//	alert.browserCloseAndQuit();
		
		

	}

}
