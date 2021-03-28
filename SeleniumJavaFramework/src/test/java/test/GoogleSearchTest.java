package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		GoogleSearchTest.googlesearchtest();
	}
	
	public static void googlesearchtest() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		GoogleSearchPageObjects searchObj = new GoogleSearchPageObjects(driver);
		
		searchObj.setTextInSearchBox("Selenium Certifications");
        searchObj.clickSearchButton();
        
        driver.close();
	}
}
