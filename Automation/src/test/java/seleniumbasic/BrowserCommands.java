package seleniumbasic;

public class BrowserCommands extends Base{
	
	public void verifyBrowersCommands() {
		String title = driver.getTitle();
		System.out.print(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String driverId = driver.getWindowHandle();
		System.out.println(driverId);
		String source = driver.getPageSource();
		System.out.println(source);
		}
public void navigationCommands() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserCommands commands = new BrowserCommands();
		commands.browserLaunch();
		commands.verifyBrowersCommands();
		commands.navigationCommands();

	}

}
