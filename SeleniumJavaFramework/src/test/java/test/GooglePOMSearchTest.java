package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GooglePOMSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		GooglePOMSearchTest.googleSearch();
	}
	public static void googleSearch() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search box
		GoogleSearchPage.textbox_search(driver).sendKeys("Selenium Certification");
		
		//click search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		
		driver.close();
		
		System.out.println("Test completed successfully");
	}
}
