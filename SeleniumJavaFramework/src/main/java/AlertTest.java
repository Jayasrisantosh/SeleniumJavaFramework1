import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/delete_customer.php");
		d.findElement(By.name("cusid")).sendKeys("123242");
		d.findElement(By.name("submit")).click();
		Alert alert = d.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		alert = d.switchTo().alert();
		alert.accept();
		System.out.println("I am Done");
		
		d.get("http://demo.guru99.com/popup.php");
		d.manage().window().maximize();
		d.findElement(By.linkText("Click Here")).click();
		
		String mainWindow =  d.getWindowHandle();
		Set<String> w1 = d.getWindowHandles();
		Iterator<String> i1 = w1.iterator();
		while(i1.hasNext()) {
			String  childWindow = i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)){
				d.switchTo().window(childWindow);
				d.findElement(By.name("emailid")).sendKeys("jayasri@gmail.com");
				d.findElement(By.name("btnLogin")).submit();
				d.close();
			}
		}
		d.switchTo().window(mainWindow);
		d.close();
	}
}
