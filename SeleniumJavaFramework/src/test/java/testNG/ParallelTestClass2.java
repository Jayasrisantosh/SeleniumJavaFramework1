package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import parallelExecution.BaseClass;

public class ParallelTestClass2 extends BaseClass {
	@Test
	public void test1() throws InterruptedException {
		getWebDriver().get("https://www.selenium.dev");
		Thread.sleep(1000);
		getWebDriver().navigate().back();
	}
	@Test
	public void test2() throws InterruptedException {
		getWebDriver().get("https://www.javatpoint.com");
		Thread.sleep(1000);
		getWebDriver().findElement(By.xpath("//a[@href='android-tutorial']")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public void test3() throws InterruptedException {
		getWebDriver().get("https://testng.org/doc/");
		Thread.sleep(1000);
	}
}
