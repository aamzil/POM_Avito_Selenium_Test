package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	
public void takeScreenshot (WebDriver driver) throws IOException {
    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    String time = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-aa").format(new java.util.Date());
    String filePath = "C:\\Users\\amzil\\eclipse-workspace\\ecom\\src\\test\\java\\screenshots\\" + time + ".png";
    File destFile = new File(filePath);
    FileUtils.copyFile(screenshotFile, destFile);
}
}
