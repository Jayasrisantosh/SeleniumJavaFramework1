package testNG;

import org.testng.annotations.Test;

//if there is no priority mentioned then testng runs based on test method in ALPHABETICAL order
//if priority mentioned then runs from lowern numer to higher number or ascending order
public class TestngPriority {
	/*
	 * @Test(priority = 2) public void login() { System.out.println("Login"); }
	 * 
	 * @Test public void navigate() { System.out.println("Navigate"); }
	 * 
	 * @Test(priority = 1) public void logout() { System.out.println("logout"); }
	 */
	
	@Test
	public void login() {
		System.out.println("Log in");
	}
	
	@Test
	public void navigate() {
		System.out.println("navigate");
	}
	
	@Test(dependsOnMethods = {"login", "navigate"})
	public void logout() {
		System.out.println("Log out");
	}
}
