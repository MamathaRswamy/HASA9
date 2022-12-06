package javaScriptExecutorPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(100,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(100,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(100,200)");
		Thread.sleep(2000);

	}
}
