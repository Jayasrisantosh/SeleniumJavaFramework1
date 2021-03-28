package testNG;

import org.testng.annotations.*;

public class Annotations1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass:Navigate to url and log in");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod: Intialize webelements");
	}
	
	@Test
	public void test1() {
		System.out.println("teststep:click on webelement 1");
	}
	
	@Test
	public void test2() {
		System.out.println("testStep1:mouse over to an element");
		System.out.println("testStep2:click one drop down");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod:mouse over back on button");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass:logout from application");
	}
	
	
}
