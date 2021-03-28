package testNG;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups = {"smoke","regression"},dependsOnMethods = "feature3")
	public void feature1() {
		System.out.println("Feature1");
	}
	@Test(groups = {"regression"}, priority = 1)
	public void feature2() {
		System.out.println("Feature2");
	}
	@Test(groups = {"performance"})
	public void feature3() {
		System.out.println("Feature3");
	}
}
