import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownload {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Upload
//		driver.get("http://demo.guru99.com/test/upload/");
//		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//		// enter the file path onto the file-selection input field
//		uploadElement.sendKeys("F:\\UAN Number_Jayasri.pdf");
//		Thread.sleep(2000);
//		// check the "I accept the terms of service" check box
//		driver.findElement(By.id("terms")).click();
//		Thread.sleep(2000);
//		// click the "UploadFile" button
//		driver.findElement(By.id("submitbutton")).click();
        
		//download
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		String sourceLocation = downloadButton.getAttribute("href");
		String wget_command = "cmd /c wget -P c: " + sourceLocation;
		try {
	        Process exec = Runtime.getRuntime().exec(wget_command);
	        int exitVal = exec.waitFor();
	        System.out.println("Exit value: " + exitVal);
	        } catch (InterruptedException | IOException ex) {
	        System.out.println(ex.toString());
	        }
		driver.close();
	}
}
