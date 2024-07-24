package tests;


import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import setup.Setup;

public class LoginTest extends Setup {
    
	@Test(priority = 0, description = "login with valid credentials")
	public void validLogin () {
		driver.get("https://www.avito.ma/");
		
	    // Instantiate HomePage object to click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate LoginPage object and perform login
		LoginPage login = new LoginPage(driver);
		login.validLogin("nirafe3830@reebsd.com", "-r^z456OPL234");
		login.isHomeMsgDisplayed();
	}
	
	@Test(priority = 1, description = "login with invalid credentials")
	public void invalidEmailOrPwdLogin () {
		driver.get("https://www.avito.ma/");
		
		// Instantiate HomePage object to click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate LoginPage object and perform login
		LoginPage login = new LoginPage(driver);
		login.invalidEmailOrPwdLogin("invalidemail3830@reebsd.com", "invalidpwd");
		login.modalAlert.isDisplayed();
	}
	
	@Test(priority = 2, description = "login with empty email input")
	public void EmptyEmailInput () {
		driver.get("https://www.avito.ma/");
		
		// Instantiate HomePage object to click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate LoginPage object and perform login
		LoginPage login = new LoginPage(driver);
		login.EmptyEmailInput("-r^z456OPL234");
	}
	
	@Test(priority = 3, description = "login with empty pwd input")
	public void EmptyPwdInput () {
		driver.get("https://www.avito.ma/");
		
		// Instantiate HomePage object to click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate LoginPage object and perform login
		LoginPage login = new LoginPage(driver);
		login.EmptyPwdInput("nirafe3830@reebsd.com");
		
	}
	
	@Test(priority = 4, description = "forgotten password")
	public void ResetPwd () {
		driver.get("https://www.avito.ma/");
		
		// Instantiate HomePage object to click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate LoginPage object and perform login
		LoginPage login = new LoginPage(driver);
		login.ResetPwd("nirafe3830@reebsd.com");
	}
	
	@Test(priority = 5, description = "Logout test after user login")
	public void logout ()   {
		driver.get("https://www.avito.ma/");
		
		// Instantiate HomePage object and click on login button
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
		// Instantiate LoginPage object and perform login and logout
		LoginPage login = new LoginPage(driver);
		login.validLogin("nirafe3830@reebsd.com", "-r^z456OPL234");
		login.logout();
	    
	}
	
	
	 
	  
}
