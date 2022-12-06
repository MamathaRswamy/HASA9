package actionsClassPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggingAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
	WebElement src = driver.findElement(By.xpath("//button[text()='Drag FROM']"));
	WebElement dest = driver.findElement(By.xpath("//button[text()='Drop TO']"));
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.click(src).dragAndDrop(src, dest).perform();
	Thread.sleep(2000);

}
}
