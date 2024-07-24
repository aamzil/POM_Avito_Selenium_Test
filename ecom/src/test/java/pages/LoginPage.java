package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	//Constructor
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]")
	WebElement loginBtn;
	
	@FindBy(name = "E-mail")
	WebElement emailInput;
	
	@FindBy(name = "Mot de passe")
	WebElement mdpInput;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div/div[5]/button")
	WebElement submitBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div/div[4]/form/div[1]/div[2]/span")
	WebElement emailErrorMsg;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div/div[4]/form/div[2]/div[2]/span")
	WebElement mdpErrorMsg;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div/div[4]/form/span")
	WebElement pwResetBtn;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/input")
	WebElement pwResetEmailInput;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/footer/div[1]/button")
	WebElement pwResetBtn2;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/p[1]")
	WebElement pwResetHeader;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/div/button/span/span/span")
	public WebElement homeMsg;
	
	@FindBy(xpath ="/html/body/div[4]/div")
	public WebElement modalAlert;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/div/button" )
	WebElement profilBtn;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/nav/div/div[3]/ul/li[3]/div/ul/li[6]/button/span" )
	WebElement logoutBtn;

	
	//Methods
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        mdpInput.sendKeys(password);
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public String getEmailErrorMsg() {
        return emailErrorMsg.getText();
    }

    public String getPasswordErrorMsg() {
        return mdpErrorMsg.getText();
    }

    public void clickPwResetBtn() {
        pwResetBtn.click();
    }

    public void enterPwResetEmail(String email) {
        pwResetEmailInput.sendKeys(email);
    }

    public void clickPwResetBtn2() {
        pwResetBtn2.click();
    }

    public String getPwResetHeader() {
        return pwResetHeader.getText();
    }

    public boolean isHomeMsgDisplayed() {
        return homeMsg.isDisplayed();
    }

    public boolean isModalAlertDisplayed() {
        return modalAlert.isDisplayed();
    }
	
    public void validLogin (String email, String mdp) {
		emailInput.sendKeys(email);
		mdpInput.sendKeys(mdp);
		submitBtn.click();
		
	}
	
	public void invalidEmailOrPwdLogin (String email, String mdp)  {
		emailInput.sendKeys(email);
		mdpInput.sendKeys(mdp);
		submitBtn.click();
	}
	
	public void EmptyEmailInput (String mdp) {
		mdpInput.sendKeys(mdp);
		submitBtn.click();
		assertEquals(emailErrorMsg.getText(), "Votre adresse email est incorrect.");
	}
	
	public void EmptyPwdInput (String email) {
		emailInput.sendKeys(email);
		submitBtn.click();
		assertEquals(mdpErrorMsg.getText(), "Votre mot de passe est trop court. Il doit contenir au minimum 5 caractères.");

	}
	
	public void ResetPwd (String email) {
		pwResetBtn.click();
		pwResetEmailInput.clear();
		pwResetEmailInput.sendKeys(email);
		pwResetBtn2.click();
		assertEquals(pwResetHeader.toString(), "Un lien de réinitialisation a été envoyé.");
	}
	
	public void logout () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		WebElement profilBtnWait = wait.until(ExpectedConditions.elementToBeClickable(profilBtn));
		profilBtnWait.click();
	}
	

}
