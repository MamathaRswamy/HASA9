package TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	Thread.sleep(2000);
	File photo = ts.getScreenshotAs(OutputType.FILE);
	File file=new File("./errorshots/webpage8.png");
	//photo.renameTo(file);
	//FileUtils.copyFile(photo, file);
	FileHandler.copy(photo, file);
	driver.quit();
}
}
