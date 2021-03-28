package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataParameters {
	
	@Test(dataProvider = "testData")
	public void registerLogin(String firstName, String lastName, String email, String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object [][] testData(){
		Object[][] obj = new Object[3][4];
		obj[0][0] = "firstname1";
		obj[0][1] = "lastname1";
		obj[0][2] = "email1@gamil.com";
		obj[0][3] = "password1";
		
		obj[1][0] = "firstname2";
		obj[1][1] = "lastname2";
		obj[1][2] = "email2@gamil.com";
		obj[1][3] = "password2";
		
		obj[2][0] = "firstname3";
		obj[2][1] = "lastname3";
		obj[2][2] = "email3@gamil.com";
		obj[2][3] = "password3";
		return obj;
	}
}
