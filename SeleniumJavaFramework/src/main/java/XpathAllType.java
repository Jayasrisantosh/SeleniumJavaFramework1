import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAllType {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		
		//AND operator,Starts-with,contains(),text function;
		driver.findElement(By.xpath("//input[@type='submit' AND @name='btnLogin']"));
		driver.findElement(By.xpath("//label[starts-with(@id,'message')]"));
		driver.findElement(By.xpath("//td[text()='UserID']"));
		
		//xpath axes methods - following, ancestor, following-sibling, child
		driver.findElement(By.xpath("//*[@type='text']/following::input[1]"));
		driver.findElement(By.xpath("//*[text()='Enterprise Testing']/ancestor::div"));
		
		//xpath axes methods - child
		driver.findElement(By.xpath("//*[id='java_technologies']//child::li[1]"));
		//xpath axes methods - sibling
		//xpath axes methods - preceding
		//xpath axes methods - 
		
		
	}
}
