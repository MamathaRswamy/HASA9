package testNgPractice;

import org.testng.annotations.Test;

public class DependOnScript {
	@Test(dependsOnMethods = "Login",priority = -1)
	public void Home() {
		System.out.println("hello Home");
	}
	@Test(priority = 5)
	public void Login() {
		System.out.println("hello Login");
	}	
	@Test(dependsOnMethods = "Home")
	public void logout() {
		System.out.println("hello logout");
	}

}
