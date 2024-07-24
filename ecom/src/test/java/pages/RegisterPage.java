package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	//constructor
	public RegisterPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]")
	WebElement loginBtn;
	
	@FindBy(linkText = "S'inscrire gratuitement.")
	WebElement registerBtn;

	@FindBy(name = "signup-name")
	WebElement nameInput;
	
	@FindBy(name = "signup-email")
	WebElement emailInput;
	
	@FindBy(name = "signup-phone")
	WebElement phoneInput;
	
	@FindBy(name = "signup-pass")
	WebElement mdpInput;
	
	@FindBy(name = "signup-pass-confirm")
	WebElement mdpConfirmInput;
	
	@FindBy(name = "signup-city")
	WebElement cityInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[4]/form/div[8]/label/input\r\n")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[4]/form/button")
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[2]/div[4]/form/div[2]/div[2]/span")
	WebElement emailErrorMsg;
	
	// Methods
	public void validRegistration (String name, String email, String phone, String pwd, String confirmPwd, String city) {
		registerBtn.click();
		nameInput.sendKeys(name);
		emailInput.sendKeys(email);
		phoneInput.sendKeys(phone);
		mdpInput.sendKeys(pwd);
		mdpConfirmInput.sendKeys(confirmPwd);
		cityInput.sendKeys(city);
		Actions action = new Actions(driver);
		action.sendKeys(cityInput, Keys.ARROW_DOWN).perform();
		action.sendKeys(cityInput, Keys.ENTER).perform();
		checkbox.click();
		submitBtn.click();		
	}
	
	public void missingFieldRegistration (String name, String phone, String pwd, String confirmPwd, String city) {
		registerBtn.click();
		nameInput.sendKeys(name);
		phoneInput.sendKeys(phone);
		mdpInput.sendKeys(pwd);
		mdpConfirmInput.sendKeys(confirmPwd);
		cityInput.sendKeys(city);
		Actions action = new Actions(driver);
		action.sendKeys(cityInput, Keys.ARROW_DOWN).perform();
		action.sendKeys(cityInput, Keys.ENTER).perform();
		checkbox.click();
		submitBtn.click();
		emailErrorMsg.isDisplayed();
	}

}
