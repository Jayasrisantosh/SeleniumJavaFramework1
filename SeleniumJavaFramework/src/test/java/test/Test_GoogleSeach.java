package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSeach {
	public static void main(String[] args) {
		Test_GoogleSeach.googleSearch();
	}
	
	public static void googleSearch() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//goto google.com
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Selenium certification");
		
		//click search button
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}
}
