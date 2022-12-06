package testNgPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
public void testCase() {
	SoftAssert assertion=new SoftAssert();
	assertion.assertEquals("data", "data4thghgh");
	assertion.assertAll();
	assertion.assertEquals("data", "data4thghgh");

	
}
}
