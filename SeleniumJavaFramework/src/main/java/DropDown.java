import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select dropDown = new Select(driver.findElement(By.name("country")));
		
		dropDown.selectByIndex(5);
		Thread.sleep(2000);
//		dropDown.deselectByIndex(5);
//		Thread.sleep(2000);
		dropDown.selectByValue("GUADELOUPE");
		Thread.sleep(2000);
//		dropDown.deselectByValue("GUADELOUPE");
//		Thread.sleep(2000);
		dropDown.selectByVisibleText("AMERICAN SAMOA");
//		Thread.sleep(2000);
//		dropDown.deselectByVisibleText("AMERICAN SAMOA");
		List<WebElement> selectedValues = dropDown.getAllSelectedOptions();
		for(WebElement wb:selectedValues) {System.out.println(wb.getText());}
		System.out.println("2: "+dropDown.getFirstSelectedOption().toString());
		List<WebElement> dropdownoptions=dropDown.getOptions();
		for(WebElement wb:dropdownoptions) {System.out.println(wb.getText());}
		System.out.println(dropDown.isMultiple());
		System.out.println(dropDown.getWrappedElement());
		Thread.sleep(3000);
//		dropDown.deselectAll();
		driver.close();
		System.out.println("I am done");
		
		
	}
}
