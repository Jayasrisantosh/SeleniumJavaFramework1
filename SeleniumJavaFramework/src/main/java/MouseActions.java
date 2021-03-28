import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException{
		//1st Program for mouse over
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/newtours/");
//		WebElement link_home = driver.findElement(By.linkText("Home"));
//		WebElement td_home = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
//		Actions builder = new Actions(driver);
//		Action mouseOverHome = builder.moveToElement(link_home).build();
//		Thread.sleep(2000);
//		String bg_color = td_home.getCssValue("background-color");
//		System.out.println("Before: "+bg_color);
//		mouseOverHome.perform();
//		Thread.sleep(2000);
//		bg_color = td_home.getCssValue("background-color");
//		System.out.println("After: "+bg_color);
//		driver.close();
		
		//2nd Program for Multiple actions
		driver.get("https://www.facebook.com");
		WebElement txtUserName = driver.findElement(By.name("email"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUserName)
				                        .click()
				                        .keyDown(txtUserName, Keys.SHIFT)
				                        .sendKeys(txtUserName, "hello")
				                        .keyUp(txtUserName, Keys.SHIFT)
				                        .doubleClick()		
				                        .contextClick()
				                        .build();
		seriesOfActions.perform();
		Thread.sleep(2000);
		driver.close();
	}
}
