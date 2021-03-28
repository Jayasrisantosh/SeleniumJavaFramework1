package testNG;

import org.testng.annotations.*;

public class Annotations2 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite: Select browser");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest: Launch browser");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass: navigate to url and login");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod: click on alert ");
	}
	@Test
	public void test11() {
		System.out.println("Test case for check the text in alert");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod:close the alert box");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass:Logout from application");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest:close browser");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("delete downloaded documents");
	}
}
