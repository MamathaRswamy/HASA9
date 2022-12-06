package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver refVar=new ChromeDriver();
		refVar.manage().window().maximize();
		
		//Opening flipkart main url using get
		refVar.get("https://flipkart.com");
		Thread.sleep(2000);
		// Navigating to amazon using to method by passing url type object
		URL url=new URL("https://amazon.com");
		refVar.navigate().to(url);
		
		Thread.sleep(2000);
		
		//Navigating back to flipkart using back method
		refVar.navigate().back();
		Thread.sleep(2000);
		
		//navigating forward using forward method
		refVar.navigate().forward();
		Thread.sleep(2000);
		
		//refreshing the page using refresh method
		refVar.navigate().refresh();
		
		//usage of to method using string argument
		refVar.navigate().to("https://amazon.com");

	}
}
