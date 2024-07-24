package pages;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnnoncePage {

	WebDriver driver;
	String imgPath = "C:\\Users\\amzil\\eclipse-workspace\\ecom\\src\\test\\java\\resources\\moto.jpg";
	String invalidImgPath = "C:\\Users\\amzil\\eclipse-workspace\\ecom\\src\\test\\java\\resources\\image.txt";

	JavascriptExecutor js;
	
	//Constructor
	public AnnoncePage (WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[1]/div/button")
	WebElement categoryBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[1]/div/div[2]/div/div[5]/div/div[2]/label")
	WebElement MainCategoryBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[1]/div/div[2]/div/div[5]/div/div[2]/div/button[2]")
	WebElement SubCategoryBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[2]/div/div/div/div[1]/span")
	WebElement citySelectionBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[2]/div/div/div/div[3]/div/div[3]/div/input")
	WebElement citySearchInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[2]/div/div/div/div[3]/div/div[7]/div/ul/li/div")
	WebElement cityResult;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[2]/div/div/div/div[3]/div/div[7]/div/ul/li[1]/div")
	WebElement neighborhoodSelectionBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[3]/div/div[2]/label/div[2]")
	WebElement hideNumBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/div/div/button")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[1]/div/div[1]/span")
	WebElement yearBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[1]/div/div[3]/div/div[7]/div/ul/li[1]")
	WebElement yearSelectionBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[2]/div/div[1]/span")
	WebElement kmBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[2]/div/div[3]/div/div[7]/div/ul/li[2]")
	WebElement kmSelectionBtn;
	
	@FindBy(id = "cylinder_size")
	WebElement cylinderInput;
	
	@FindBy(id = "moto_seat_height")
	WebElement seatInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[5]/div/div/label[1]")
	WebElement conditionBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[6]/div/div/label[3]/span")
	WebElement originBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[7]/div/div/label[1]")
	WebElement wheelsBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section[1]/div/div[8]/div/div/label[1]/span")
	WebElement ownerBtn;
	
	@FindBy(id = "price")
	WebElement priceInput;
	
	@FindBy(id = "title")
	WebElement titleInput;
	
	@FindBy(id = "description")
	WebElement descInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/div/div/button" )
	WebElement continueBtn2;
	
	@FindBy(id = "file-picker" )
	WebElement insertImg;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/div/div/button" )
	WebElement continueBtn3;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/div/div/button" )
	WebElement publishBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[1]/div/form/section/div/div[3]/div[1]" )
	WebElement typeErrorMsg;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[2]" )
	WebElement publishContainer;
	
	
	//Methods
	 public void scrollToElem(WebElement elem) {
		 js.executeScript("arguments[0].scrollIntoView(true);", elem);
	 }
	
	 public void postAnnouncement(String city, String cylinderSize, String seatHeight, String price, String title, String description) throws InterruptedException {
		    // Click the category button to start posting the announcement
		    categoryBtn.click();
		    
		    // Select the main category for the announcement
		    MainCategoryBtn.click();
		    
		    // Select the sub-category for more specific details
		    SubCategoryBtn.click();
		    
		    // Select the city where the vehicle is located
		    Thread.sleep(3000); 
		    scrollToElem(citySelectionBtn);
		    citySelectionBtn.click(); 
		    
		    // Input the city name into the search field and select the matching result
		    citySearchInput.sendKeys(city); 
		    cityResult.click(); 
		    neighborhoodSelectionBtn.click(); 
		    continueBtn.click(); 
		    
		    // Input additional details such as year and kilometers
		    yearBtn.click(); 
		    yearSelectionBtn.click(); 
		    
		    kmBtn.click(); 
		    kmSelectionBtn.click(); 
		    
		    // Input specific details about the vehicle
		    cylinderInput.sendKeys(cylinderSize); 
		    seatInput.sendKeys(seatHeight); 
		    
		    // Input pricing details and description
		    priceInput.sendKeys(price); 
		    titleInput.sendKeys(title); 
		    descInput.sendKeys(description); 
		    continueBtn2.click(); 
		    
		    // Upload an image of the vehicle
		    insertImg.sendKeys(imgPath); 
		    Thread.sleep(5000); // Adding a delay to ensure image is uploaded
		    
		    // Wait for the continue button to be clickable and click it
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		    WebElement continueEle = wait.until(ExpectedConditions.elementToBeClickable(continueBtn3));
		    continueEle.click(); 
		    
		    // Publish the announcement
		    publishBtn.click();
		    publishContainer.isDisplayed();
		}
	 
	 public void invalidDataType (String city, String cylinderSize, String seatHeight, String price, String title, String description) throws InterruptedException {
		    // Click the category button to start posting the announcement
		    categoryBtn.click();
		    
		    // Select the main category for the announcement
		    MainCategoryBtn.click();
		    
		    // Select the sub-category for more specific details
		    SubCategoryBtn.click();
		    
		    // Select the city where the vehicle is located
		    Thread.sleep(3000); 
		    scrollToElem(citySelectionBtn);
		    citySelectionBtn.click(); 
		    
		    // Input the city name into the search field and select the matching result
		    citySearchInput.sendKeys(city); 
		    cityResult.click(); 
		    neighborhoodSelectionBtn.click(); 
		    continueBtn.click(); 
		    
		    // Input additional details such as year and kilometers
		    yearBtn.click(); 
		    yearSelectionBtn.click(); 
		    
		    kmBtn.click(); 
		    kmSelectionBtn.click(); 
		    
		    // Input specific details about the vehicle
		    cylinderInput.sendKeys(cylinderSize); 
		    seatInput.sendKeys(seatHeight); 
		    
		    // Input pricing details and description
		    priceInput.sendKeys(price); 
		    titleInput.sendKeys(title); 
		    descInput.sendKeys(description); 
		    continueBtn2.click(); 
		    
		    // Upload an image of the vehicle
		    insertImg.sendKeys(invalidImgPath); 
		    Thread.sleep(5000); // Adding a delay to ensure image is uploaded
		    
		    typeErrorMsg.isDisplayed();
		    
		}
}
	
	
	
	
	
	
	
	

