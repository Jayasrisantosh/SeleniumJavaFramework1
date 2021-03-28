package testNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Pass");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Fail");
	}
}
