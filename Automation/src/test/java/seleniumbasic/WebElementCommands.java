package seleniumbasic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base {
	
	public void verifyCommands() {
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messageBox =	driver.findElement(By.id("single-input-field"));
	Wait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))// FluentWait ,Wait is Interface and fluentWait is refrence variable
			.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.visibilityOf(messageBox));
	messageBox.sendKeys("test message");
	WebElement showMessage = driver.findElement(By.id("button-one"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  //Explicit wait
	wait.until(ExpectedConditions.elementToBeClickable(showMessage));  //Expected Condition is pre defined class
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
