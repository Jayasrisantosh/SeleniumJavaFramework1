package testNG;

import org.testng.annotations.Test;

public class AdvanceDataProvideTest {
	@Test(dataProviderClass=AdvanceDataProvider.class,dataProvider="data")
	public void registerUser(String firstName,String lastName, String email, String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
	}
	
	@Test(dataProviderClass=AdvanceDataProvider.class, dataProvider="data")
	public void loginUser(String email,String password) {
		System.out.println(email);
		System.out.println(password);
	}
}
