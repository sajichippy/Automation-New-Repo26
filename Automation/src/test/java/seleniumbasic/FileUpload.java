package seleniumbasic;

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

	public static void main(String[] args) {
		
		FileUpload files = new FileUpload();
		files.browserLaunch();
		files.verifyFileUpload();
		
	}

}
