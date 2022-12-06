package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagetingToAmazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeDriver refVar=new ChromeDriver();
	refVar.get("https://www.flipkart.com/");
	System.out.println("i love selenium");
}
}
