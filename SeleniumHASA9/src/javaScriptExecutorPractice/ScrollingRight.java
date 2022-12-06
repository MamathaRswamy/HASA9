package javaScriptExecutorPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingRight {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.album.alexflueras.ro/index.php");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(1000,100);");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(1000,100);");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(1000,100);");
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(-1000,100);");
}
}
