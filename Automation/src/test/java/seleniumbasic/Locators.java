package seleniumbasic;

import org.openqa.selenium.By;

public class Locators extends Base {
	
	public void verifyMethod() {
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//button[text()='Get Total']")); // using text when u dont have id and other locators
		
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));  // AND operator used
		driver.findElement(By.xpath(" //button[@id='button-one' or @id='button-one-electronics']"));	// OR operator used
		driver.findElement(By.xpath(" //div[contains (text()='Single Input Field')]//parent:div[@class='class']")); // Xpath access method
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));// child relation
		driver.findElement(By.xpath(" //button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath(" //button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
		
		
		// /html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button - absolute Xpath
	}

	public static void main(String[] args) {
		
	}

}
