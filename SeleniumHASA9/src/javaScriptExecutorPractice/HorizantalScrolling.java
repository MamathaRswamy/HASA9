package javaScriptExecutorPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizantalScrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.album.alexflueras.ro/index.php");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(3000,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(3000,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-3000,200)");

	}
}
