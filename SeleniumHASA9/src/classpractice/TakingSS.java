package classpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSS {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SeleniumHASA9\\software\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TakesScreenshot ts=(TakesScreenshot) driver;
	Thread.sleep(2000);
	File photo=ts.getScreenshotAs(OutputType.FILE);
			File file=new File("./errorshots/webpage.png");
	FileHandler.copy(photo,file);
	
	driver.quit();
			
	
}
	

}
