package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_GoogleSeach2 {
	WebDriver driver = null;
	
	@BeforeTest
	public void setupTest() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void googleSearch2() {
		// goto google.com
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// enter text in search box
		driver.findElement(By.name("q")).sendKeys("Selenium certification");

		// click search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	@Test
	public void googleSearch3() {
		// goto google.com
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// enter text in search box
		driver.findElement(By.name("q")).sendKeys("Selenium certification");

		// click search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDown() {
		// close browser
		driver.close();

		System.out.println("Test completed successfully");
	}
}
