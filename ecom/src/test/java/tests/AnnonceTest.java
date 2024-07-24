package tests;

import org.testng.annotations.Test;

import pages.AnnoncePage;
import pages.HomePage;
import pages.LoginPage;
import setup.Setup;


public class AnnonceTest extends Setup {
	
	@Test
	public void postAnnonce() throws InterruptedException {
	    driver.get("https://www.avito.ma/");
	    
	    // Instantiate HomePage object and clicking on "Publier une annonce"
	    HomePage home = new HomePage(driver);
	    home.clickAnnonceBtn(); 
	    
	    // Instantiate LoginPage object and perform login
	    LoginPage login = new LoginPage(driver);
	    login.validLogin("nirafe3830@reebsd.com", "-r^z456OPL234");
	    
	    // Instantiate Annonce object and post a new announcement
	    AnnoncePage annonce = new AnnoncePage(driver);
	    annonce.postAnnouncement("Rabat", "120", "20", "30000", "Moto à vendre", "lorem ipsum");
	}
	
	@Test
	public void invalidImageType () throws InterruptedException {
	    driver.get("https://www.avito.ma/");
	    
	    // Instantiate HomePage object and clicking on "Publier une annonce"
	    HomePage home = new HomePage(driver);
	    home.clickAnnonceBtn(); 
	    
	    // Instantiate LoginPage object and perform login
	    LoginPage login = new LoginPage(driver);
	    login.validLogin("nirafe3830@reebsd.com", "-r^z456OPL234");
	    
	    // Instantiate Annonce object and post a new announcement
	    AnnoncePage annonce = new AnnoncePage(driver);
	    annonce.invalidDataType("Rabat", "120", "20", "30000", "Moto à vendre", "lorem ipsum");
	}

}
	