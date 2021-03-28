import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class LocatorsTest {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement textbox = driver.findElement(By.xpath("//input[@title= 'Search']"));
		textbox.sendKeys("Changed way");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		textbox.sendKeys("I am in text box");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		//Cascading Styling Sheets(CSS) with ID
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Movieshfsjakhfdhshjhjshjhjhlhlsahflkfj");
		driver.get("http://demo.guru99.com/test/facebook.html");
		//css with class
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("hsakhdkjhashldjasjdlja");
		//css with multiple options and select particular webelt
		driver.findElement(By.cssSelector("input.inputtext[tabindex='2']")).sendKeys("nfdjfhoihsdjcndj");
		Thread.sleep(2000);
		driver.get("http://google.com");
		//css with other attribute(simple example)
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Movies");
		//css with other attribute for image links
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		//css with substring
		//driver.findElement(By.cssSelector("[class*='gLFyf']")).sendKeys("jidjisjfisjf");
		//Thread.sleep(2000);
		//css with suffix
		//css with prefix
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("recharge");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement> elts = driver.findElements(By.partialLinkText("Recharge"));
		System.out.println(elts.size());
		
		//DOM Locator1
		driver.get("http://demo.guru99.com/test/facebook.html");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js1.executeScript("document.getElementById('email').value='login123'");
		Thread.sleep(5000);
		
		//DOM Locator2
		driver.get("http://demo.guru99.com/test/newtours/");
        JavascriptExecutor js2 = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js2.executeScript("document.forms['home'].elements['userName'].value='login123'");
        Thread.sleep(5000);
        
        //Document Object Model Locator3
        driver.findElement(By.linkText("Register here")).click();
        JavascriptExecutor js3 = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js3.executeScript("document.forms[0].elements['phone'].value='1234567898767'");
        js3.executeScript("document.forms[0].elements[2].value='uefafylay'");
        Thread.sleep(5000);
        
        
        driver.close();
		System.out.println("I am done");
	}
}
