package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		//alert.accept();
		String message="Please enter some search keyword";
		if(message.equals(alert.getText())) {
			System.out.println("tc passed");
		}else {
			System.out.println("test case failed");
		}
		alert.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
	
	}
}
