package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base {
	
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
		WebElement frameOne = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameOne);
		WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeading.getText());
		driver.switchTo().defaultContent();   // switching to default content
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FramesHandling frame = new FramesHandling();
frame.browserLaunch();
frame.verifyFrames();
	}

}
