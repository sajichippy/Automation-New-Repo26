package testScripts;

import org.testng.annotations.Test;

import java.io.IOException;



import Pages.LoginPage;
import Utilities.ExcelUtility;
import seleniumbasic.TestNGBase;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		
		//WebElement userName = driver.findElement(By.id("user-name"));
		//userName.sendKeys("standard_user");
	//	WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		//WebElement login = driver.findElement(By.id("login-button"));
		//login.click();
		String userNameValue = ExcelUtility.readStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.readStringData(0, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver) ;
			loginPage.enterUserNameInUserField(userNameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickLoginButton();
		
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInValidPassowrd() throws IOException {
		/*WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("invaliduser");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue = ExcelUtility.readStringData(1, 0, "LoginPage");
		String passwordValue = ExcelUtility.readStringData(1, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver) ;
			loginPage.enterUserNameInUserField(userNameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickLoginButton();
		
		
	}
	
	@Test
	public void verifyUserLoginWithInValidUsernameAndValidPassowrd() throws IOException
	{
		/*WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("chippysaji");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue = ExcelUtility.readStringData(2, 0, "LoginPage");
		String passwordValue = ExcelUtility.readStringData(2, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver) ;
			loginPage.enterUserNameInUserField(userNameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithInValidUsernameAndInValidPassowrd() throws IOException
	{
	/*	WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("chippysaji");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("invaliduser");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue = ExcelUtility.readStringData(3, 0, "LoginPage");
		String passwordValue = ExcelUtility.readStringData(3, 1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver) ;
			loginPage.enterUserNameInUserField(userNameValue);
			loginPage.enterPasswordOnPasswordField(passwordValue);
			loginPage.clickLoginButton();
	}

}
