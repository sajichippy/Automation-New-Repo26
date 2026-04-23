package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void verifyCommands() {
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messageBox =	driver.findElement(By.id("single-input-field"));
	messageBox.sendKeys("test message");
	WebElement showMessage = driver.findElement(By.id("button-one"));
    showMessage.click();
    WebElement yourMessage = driver.findElement(By.id("message-one"));
    System.out.println(yourMessage.getText());
    System.out.println(showMessage.getTagName());
    messageBox.clear();
	}

	public static void main(String[] args) {
		WebElementCommands webElement = new WebElementCommands();
		webElement.browserLaunch();
		webElement.verifyCommands();
		
	}

}
