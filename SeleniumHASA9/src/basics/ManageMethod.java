package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver refVar=new ChromeDriver();
		
		//To maximize the window
		refVar.manage().window().maximize();
		
		//To open window in fullscreen mode
		refVar.manage().window().fullscreen();
		
		//To print the height and width of window 
		System.out.println(refVar.manage().window().getSize());
		
		//To change the size of window
		Dimension d=new Dimension(200, 500);
		refVar.manage().window().setSize(d);
		
		//To print x and y coordindates of window
		System.out.println(refVar.manage().window().getPosition());
		
		//To change position of window
		Point p=new Point(300, 100);
		refVar.manage().window().setPosition(p);
	}
}
