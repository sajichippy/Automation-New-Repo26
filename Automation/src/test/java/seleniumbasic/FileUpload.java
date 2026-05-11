package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void verifyFileUpload() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys("C:\\Users\\HP\\git\\Automation-New-Repo26\\Automation\\src\\test\\resources\\Testing.pdf");
        WebElement clickTerm = driver.findElement(By.id("terms"));
        clickTerm.click();
        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();
	
	}
	public void verifyFileUploadUsingRobot() throws AWTException {
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement uploadFile = driver.findElement(By.id("pickfiles"));
		uploadFile.click();
		StringSelection selector = new StringSelection("C:\\Users\\HP\\git\\Automation-New-Repo26\\Automation\\src\\test\\resources\\Testing.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selector, null);
		Robot robot = new Robot();
		robot.delay(2500);// its given in milisec its 2.5 sec
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

	public static void main(String[] args) {
		
		FileUpload files = new FileUpload();
		files.browserLaunch();
	//	files.verifyFileUpload();
		try {
			files.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
