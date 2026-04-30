package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
public void verifyDropDown() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	
	WebElement dropDown = driver.findElement(By.id("dropdowm-menu-1"));
	Select sel = new Select(dropDown);
	//sel.selectByIndex(2);
	//sel.selectByValue("c#");
	sel.selectByVisibleText("SQL");
	}
public void verifyCheckBox() {
	WebElement checkBox = driver.findElement(By.xpath("//input[@value='option-1']"));
	checkBox.click();
}

public void verifyRadioButton() {
	WebElement radioButton = driver.findElement(By.xpath("//input[@value='blue']"));
	radioButton.click();
}
	public static void main(String[] args) {
		HandlingDropDown obj = new HandlingDropDown();
		obj.browserLaunch();
		obj.verifyDropDown();
		obj.verifyCheckBox();
		obj.verifyRadioButton();

	}

}
