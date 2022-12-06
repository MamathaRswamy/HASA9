package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver refVar=new ChromeDriver();
		refVar.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		refVar.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		System.out.println(refVar.getWindowHandles());
		
}
}