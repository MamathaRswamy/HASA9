package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		WebElement EmailTF = driver.findElement(By.id("Email"));
		//entering data using senkeys
		EmailTF.sendKeys("data");
		//To check value data is enetred properly
		System.out.println(EmailTF.getAttribute("value"));
		//to clear the data in TF
		EmailTF.clear(); 
		WebElement link = driver.findElement(By.linkText("Register"));
		//to click on element
		link.click();
		//to print the text of an element
		System.out.println(link.getText());
		//to print the tagname of the element
		System.out.println(link.getTagName());
		
	}
}
