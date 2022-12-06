package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBToFrame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.tripodeal.com/hotels");
	
	//driver.switchTo().frame("tpcwl_iframe");
	//driver.switchTo().frame(0);
	WebElement element = driver.findElement(By.xpath("//iframe[@id='tpcwl_iframe']"));
	driver.switchTo().frame(element);
	driver.findElement(By.id("hotels-destination-whitelabel_en")).sendKeys("bangalore");
}
}
