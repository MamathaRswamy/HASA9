package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	ChromeDriver refVar=new ChromeDriver();
	refVar.get("https://www.amazon.com");
	String ExpectedTitle="Amazon.com. Spend less. Smile more.";
	String TitleOfWebpage = refVar.getTitle();
	if(ExpectedTitle.equals(TitleOfWebpage)) {
		System.out.println("test case passed");
	}else {
		System.out.println("test case failed");
	}
}
}
