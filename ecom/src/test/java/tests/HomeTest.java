package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import setup.Setup;

public class HomeTest extends Setup {
	
	@Test(priority = 0, description = "Valid search with yamaha in the search input and rabat as a city")
	public void validSearch ()   {
		driver.get("https://www.avito.ma/");
		
	    // Instantiate HomePage object and perform search
		HomePage home = new HomePage(driver);
		home.validSearch("yamaha", "Rabat");
	}
	
	@Test(priority = 1, description = "No result search with invalid search input")
	public void noResultSearch ()   {
		driver.get("https://www.avito.ma/");
		
	    // Instantiate HomePage object and perform search
		HomePage home = new HomePage(driver);
		home.noResultSearch("noresultsearch", "Rabat");
	}
	

	

}
