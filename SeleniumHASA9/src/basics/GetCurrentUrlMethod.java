package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver refVar=new ChromeDriver();
		refVar.get("https://demowebshop.tricentis.com/");
		System.out.println(refVar.getCurrentUrl());
		refVar.findElement(By.linkText("Log in")).click();
		System.out.println(refVar.getCurrentUrl());

		
	}
}
