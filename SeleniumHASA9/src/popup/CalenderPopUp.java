package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.tripodeal.com/hotels");
	driver.switchTo().frame("tpcwl_iframe");
	driver.findElement(By.id("hotels-dates-checkin-prepop-whitelabel_en")).click();
	driver.findElement(By.id("mewtwo-datepicker-2022-12-10")).click();
}
}
