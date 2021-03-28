import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", projectPath+"\\drivers\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads");
		driver.close();
	}
}
