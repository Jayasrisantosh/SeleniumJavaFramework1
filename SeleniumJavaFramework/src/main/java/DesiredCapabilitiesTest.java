

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		//Commonly used arguments in chrome options
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // maximize mode
		options.addArguments("incognito"); //incognito mode
		options.addArguments("version"); //prints version
		options.addArguments("disable-infobar"); //prevents chrome from displaying the notification 'Chrome is being controlled by automated software'
		ChromeDriver chromeDriver = new ChromeDriver(options);
		chromeDriver.get("https://google.com");
		Thread.sleep(5000);
		chromeDriver.close();
		
		//Desired capabilities for chrome driver
		DesiredCapabilities sslCertificate = DesiredCapabilities.chrome();
		sslCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver(sslCertificate);
        		
		
		
		//TODO: Add blocker extention
		
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//		
//		ChromeOptions options1 = new ChromeOptions();
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");
//		options.setExperimentalOption("prefs", prefs);
		
		
		
//		driver.close();
//		driver.quit();
	}
}
