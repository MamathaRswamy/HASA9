package popup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
	Runtime.getRuntime().exec("./autoIt/file.exe");
}
}
