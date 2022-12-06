package actionsClassPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginUsingAct {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement element = driver.findElement(By.id("Email"));
		WebElement passwrodTF = driver.findElement(By.id("Password"));
		WebElement emailButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		Actions act=new Actions(driver);
		act.sendKeys(element, "selenium@143")
		.sendKeys(passwrodTF, "545454545454")
		.click(emailButton).perform();
	}
}
