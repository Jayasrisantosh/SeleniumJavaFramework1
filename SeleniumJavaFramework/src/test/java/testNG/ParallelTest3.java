package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest3 {
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {{"test1"},{"test2"},{"test3"}};
	}
	
	@Test(dataProvider="getData")
	public void tescase(String value) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.xpath("//text='search'")).click();
		driver.findElement(By.id("gsc-i-id1")).sendKeys(value);
		Thread.sleep(1000);
		driver.quit();
	}
}
