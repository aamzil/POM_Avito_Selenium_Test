package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;
import setup.Setup;

public class RegisterTest extends Setup {
	
	@Test(priority = 0, description = "Signup process with valid credentials")
	public void validRegistration () {
		driver.get("https://www.avito.ma/");
		
	    // Instantiate HomePage object and clicking on "Se connecter"
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate RegisterPage object and perform registration"
		RegisterPage register = new RegisterPage(driver);
		register.validRegistration("Ayoub NG", "reraj45119@sablecc.com", "0783672399", "-r^z456OPL234", "-r^z456OPL234", "Rabat");
	}
	
	@Test(priority = 1, description = "Signup process with missing inputs")
	public void missingFieldRegistration () {
		driver.get("https://www.avito.ma/");
		
	    // Instantiate HomePage object and clicking on "Se connecter"
		HomePage home = new HomePage(driver);
		home.clickLoginBtn();
		
	    // Instantiate RegisterPage object and perform registration"
		RegisterPage register = new RegisterPage(driver);
		register.missingFieldRegistration("Ayoub NG", "0783672399", "-r^z456OPL234", "-r^z456OPL234", "Rabat");
	}
	
}
