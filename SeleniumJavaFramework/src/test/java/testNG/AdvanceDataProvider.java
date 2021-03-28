package testNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;



public class AdvanceDataProvider {
	
	@DataProvider(name="data")
	public Object[][] testData(Method m){
		Object [][] obj = null;
		
		if(m.getName().equals(("registerUser"))) {

			obj = new Object[3][4];
			obj[0][0] = "Dhana";
			obj[0][1]= "Vasuki";
			obj[0][2] = "email1.com";
			obj[0][3] = "2345678";
			
			obj[1][0] = "Nilepa";
			obj[1][1] = "Nirakara";
			obj[1][2] = "email2.com";
			obj[1][3] = "2345678";
			
			obj[2][0] = "Nishkaran";
			obj[2][1] = "Nirguna";
			obj[2][2] = "email3.com";
			obj[2][3] = "2345678";
			
		}
		if(m.getName().equals("loginUser")) {
			 obj = new Object[3][2];
				obj[0][0] = "email1.com";
				obj[0][1] = "2345678";
				
				obj[1][0] =  "email2.com";
				obj[1][1] = "2345678";
				
				obj[2][0] = "email3.com";
				obj[2][1] = "2345678";	
		}
		return obj;
	}
	
//	@DataProvider(name="logindata")
//	public Object[][] loginTestData(){
//		Object[][]  obj = new Object[3][2];
//		obj[0][0] = "email1.com";
//		obj[0][1] = "2345678";
//		
//		obj[1][0] =  "email2.com";
//		obj[1][1] = "2345678";
//		
//		obj[2][0] = "email3.com";
//		obj[2][1] = "2345678";
//		
//		return obj;
//	}
}
