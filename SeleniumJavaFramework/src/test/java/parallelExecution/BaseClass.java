package parallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseClass {
	public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();

	@BeforeClass
	public void beforeMethod() throws IllegalAccessException {
		WebDriver driver = new WebDriverFactory().create("CHROME");
		setWebDriver(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}
	public WebDriver getWebDriver() {
		return dr.get();
	}
	@AfterClass
	public void afterMethod() {
		getWebDriver().quit();
		dr.set(null);
	}
}
