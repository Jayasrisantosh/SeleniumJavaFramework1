package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
		Assert.assertFalse(true);
	}
}
