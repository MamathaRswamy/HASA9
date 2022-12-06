package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GettingWindowId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver refVar=new ChromeDriver();
		refVar.get("https://www.amazon.com");
		System.out.println(refVar.getWindowHandle());
	}
}
