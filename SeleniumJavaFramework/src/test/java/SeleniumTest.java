import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().version("2.36").setup();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		Thread.sleep(2000);
		driver.close();
	}

}
