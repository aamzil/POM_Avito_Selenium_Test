package setup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Utils;


public class Setup {
	public WebDriver driver;
	
	@BeforeTest
	public void start () {
		System.setProperty("webdriver.egde.driver", "msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
    // Method to take screenshot after each test failure
	@AfterMethod
	public void takeScr (ITestResult result) {
		Utils utils = new Utils();
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				utils.takeScreenshot(driver);
				System.out.print("Screenshot captured");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();
	}

}
