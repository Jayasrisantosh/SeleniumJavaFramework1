package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class LoginTest {
	@Test
	public void loginViaEmail() {
		System.out.println("Login via email");
		try {
			Assert.assertEquals("123","1234");
		} catch (Throwable e) {
			System.out.println("======Error====="+e);
		}
		
	}
	@Test
	public void loginViaFacebook() {
		System.out.println("Login via facebook");
		throw new SkipException("Facebook not supported");
	}
	@Test
	public void loginViaTwitter() {
		System.out.println("Login via twitter");
		Assert.assertTrue(true);
	}
}
