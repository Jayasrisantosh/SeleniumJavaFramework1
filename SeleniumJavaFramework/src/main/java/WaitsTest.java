import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.google.common.base.Function;

public class WaitsTest {
	WebDriver driver=null;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test(dependsOnMethods = {"explicitwaitTest"})
	public void fluentwaitTest() throws InterruptedException {	
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement elt = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkelt = driver.findElement(By.linkText("ChuChu TV"));
		       if(linkelt.isEnabled())
		       {
		    	   System.out.println("Element is enabled");
		       }
		       return linkelt;
		       }
		     });
		    System.out.println("==============================close=============");
	}
	
	@Test(dependsOnMethods = "implicitlywaitTest")
	public void explicitwaitTest() throws InterruptedException {
		System.out.println("explicitwaitTest");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elt = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));	
		elt.click();
		
	}
	@Test
	public void implicitlywaitTest() {
		System.out.println("Implicitlywait");
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
