package TakingScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakinsSSofWE {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement element = driver.findElement(By.id("small-searchterms"));
		File photo = element.getScreenshotAs(OutputType.FILE);
		File file=new File("./errorshots/webelement.png");
		FileUtils.copyFile(photo, file);
	
	}
}
