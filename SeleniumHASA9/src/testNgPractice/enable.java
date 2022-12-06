package testNgPractice;

import org.testng.annotations.Test;

public class enable {
	@Test(enabled = true,priority = 1)
	public void sam() {
		System.out.println("hello sam");
	}
	@Test(priority = -1,enabled = false)
	public void mam() {
		System.out.println("hello mam");
	}	
	
}
