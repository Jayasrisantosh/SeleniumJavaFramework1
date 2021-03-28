import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String text,path;
		//Basic table		
//		driver.get("F://table.html");
//		String innerText = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
//		System.out.println(innerText);
		
		//Accessing Nested Tables
//		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
//		String shortest_xpath_text=driver.findElement(By.xpath("//td[2]/table//tr[2]/td[1]")).getText();
//		String clear_xpath_text=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]")).getText();
//	    System.out.println(shortest_xpath_text);
//	    System.out.println(clear_xpath_text);
		
		//Using attributes as predicates
		driver.get("http://demo.guru99.com/test/newtours/");
//		String text=driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td[1]")).getText();
//		System.out.println(text);
		
		//path="table:nth-child(3) tbody:nth-child(1) tr:nth-child(3) td:nth-child(2) > font:nth-child(1)";
		path="//table/tbody/tr[1]/td[2]//table[2]/tbody/tr[*]/td[2]";
		text=driver.findElement(By.cssSelector(path)).getText();
		System.out.println(text);
		
		
		driver.close();
	
	}

}
