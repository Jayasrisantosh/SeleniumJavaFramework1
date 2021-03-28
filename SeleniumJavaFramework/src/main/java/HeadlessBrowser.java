import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size:1366,768");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://assertible.com/docs/guide/assertions#json-schema");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Creating web services")).click();
		driver.quit();
		System.out.println("===completed=====");
	}
}
