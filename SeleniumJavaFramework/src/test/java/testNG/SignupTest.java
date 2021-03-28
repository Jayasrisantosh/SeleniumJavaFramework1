package testNG;

import org.testng.annotations.Test;

public class SignupTest {
	@Test
	public void SignupViaEmail() {
		System.out.println("Signup via email");
	}
	
	@Test
	public void SignupViaFacebook() {
		System.out.println("Signup via facebook");
	}
	@Test
	public void SignupTwitter() {
		System.out.println("SignUp via twitter");
	}
}
