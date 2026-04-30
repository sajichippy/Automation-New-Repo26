package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		WebElement rowDetails = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[4]"));
		System.out.println(rowDetails.getText());
	}
	

	public static void main(String[] args) {
		TableHandling fetchData = new TableHandling();
		fetchData.browserLaunch();
		fetchData.verifyTable();
		fetchData.browserCloseAndQuit();

	};

}
