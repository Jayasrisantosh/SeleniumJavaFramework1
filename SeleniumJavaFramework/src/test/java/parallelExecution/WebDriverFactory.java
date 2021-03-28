package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public WebDriver create(String type) throws IllegalAccessException {
		WebDriver driver;
		switch(type) {
		case "FIREFOX": WebDriverManager.firefoxdriver().setup();
		                driver = new FirefoxDriver();
		                break;
		case "CHROME": WebDriverManager.chromedriver().setup();
					   driver = new ChromeDriver();	
					   break;
		default: throw new IllegalAccessException();
		         
		} 
		return driver;
	}
}
