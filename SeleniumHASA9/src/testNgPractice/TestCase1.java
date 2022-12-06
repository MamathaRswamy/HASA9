package testNgPractice;

import org.testng.annotations.Test;

public class TestCase1 {
	@Test(priority = -1)
	public void sam() {
		System.out.println("hello sam");
	}
	@Test(priority = -1)
	public void mam() {
		System.out.println("hello mam");
	}	
	@Test(priority = -1)
	public void dam() {
		System.out.println("hello dam");
	}
}
