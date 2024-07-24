package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	// Constructor
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/span/span")
	WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[4]/div/div/button")
	WebElement annonceBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[1]/a/span/img")
	WebElement homeBtn;
	
	@FindBy(xpath = "//*[@id=\"keyword-suggestion\"]/div/input")
	WebElement searchInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/button[1]")
	WebElement categoryBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[3]/div/div[2]/div[5]/div/div[5]/div/div[3]/label")
	WebElement mainCategory;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[3]/div/div[2]/div[5]/div/div[5]/div/div[3]/div/button[2]")
	WebElement subCategory;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[3]/div/div[2]/div[5]/div/div[7]/button")
	WebElement confirmBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[5]/div[1]/div/button[2]")
	WebElement cityBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[5]/div[5]/div/div[3]/div/input")
	WebElement searchCityInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[5]/div[5]/div/div[7]/div/ul/li/label")
	WebElement searchResult;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[5]/div[5]/div/div[9]/button")
	WebElement confirmBtn2;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[5]/div[1]/div/button[3]")
	WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[5]/div[1]")
	WebElement resultContainer;
	
	@FindBy(id = "Layer_1")
	WebElement noResultContainer;

	
	
	
	
	// Methods
	public void clickLoginBtn () {
		loginBtn.click();
	}
	
	public void clickAnnonceBtn () {
		annonceBtn.click();
	}
	
	public void validSearch (String name, String city)  {
		// City selection
		cityBtn.click();
		searchCityInput.sendKeys(city);
		searchResult.click();
		confirmBtn2.click();
		
		// Category selections
		categoryBtn.click();
		mainCategory.click();
		subCategory.click();
		confirmBtn.click();
		
		// Enter search input 
		searchInput.sendKeys(name);
		
		// Search button click
		searchBtn.click();
		
		// Verify if the result container is displayed
		resultContainer.isDisplayed();
		
	}
	
	public void noResultSearch (String name, String city)  {
		// City selection
		cityBtn.click();
		searchCityInput.sendKeys(city);
		searchResult.click();
		confirmBtn2.click();
		
		// Category selection
		categoryBtn.click();
		mainCategory.click();
		subCategory.click();
		confirmBtn.click();
		
		// Enter search input 
		searchInput.sendKeys(name);
		
		// Search button click
		searchBtn.click();
		
		// Verify if the no result illustration is displayed
		noResultContainer.isDisplayed();
		
	}
	


}
