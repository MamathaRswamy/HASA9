package testNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotations {
	@Test
	public void Testcase() {
		System.out.println("TC01");
	}
	@BeforeSuite
	public void beforeSuiteAn() {
		System.out.println("beforeSuiteAn");
	}
	@BeforeTest
	public void beforeTestAn() {
		System.out.println("beforeTestAn");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void AfterMetod() {
		System.out.println("AfterMetod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	@Test
	public void testing() {
		System.out.println("tc02");
	}
}
