package seleniumbasic;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HandlingClass extends Base {
	
	public void verifyRightClick() {
		WebElement otherMenu = driver.findElement(By.id("others"));
		Actions a = new Actions(driver);  // Action is class
		a.contextClick(otherMenu).build().perform();   //RightClick and  to perform that action we need to use build and perform method
		
	}
public void verifyMouseHover() {
	WebElement otherMenu = driver.findElement(By.id("others"));
	Actions a = new Actions(driver); 
     a.moveToElement(otherMenu).build().perform();     //MouseHover
}

public void verifyDragAndDrop() {
	driver.navigate().to(" https://demoqa.com/droppable");
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions b = new Actions(driver);
	b.dragAndDrop(drag, drop).build().perform();     //drag and drop
}

public void verifyKeyBoardActions() throws AWTException {
	Robot c = new Robot();
	c.keyPress(KeyEvent.VK_CONTROL);  //keyboard control for control key
	c.keyPress(KeyEvent.VK_T);        // keyboard control for t key
	c.keyRelease(KeyEvent.VK_CONTROL);   // to release a control from that key
	c.keyRelease(KeyEvent.VK_T);
	
}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		HandlingClass act = new HandlingClass();
		act.browserLaunch();
		//act.verifyRightClick(); //rightclick
		act.verifyMouseHover();
		act.verifyDragAndDrop();
		try {
			act.verifyKeyBoardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
