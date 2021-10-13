package loginTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
	@Test(description = "Valid Test")
	public void validLoginTest() {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password");
		Assert.assertTrue(status,"Login Failed with valid Credential"); // Checking Status is true or not
	}
	
	@Test(description = "InValid Test")
	public void invalidLoginTest() {
		App ap = new App();
		boolean status = ap.userLogin("userdemo", "password123");
		Assert.assertFalse(status); // Checking Status is true or not
	}
}