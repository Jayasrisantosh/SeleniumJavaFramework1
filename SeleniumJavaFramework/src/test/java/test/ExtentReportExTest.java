package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportExTest {
	
	WebDriver driver = null;
	ExtentReports extent = null;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//start reports
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		// create extent report and attach reporter
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	
	@Test
	public void googleSearch() throws IOException {
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	@Test
	public void googleSearch2() throws IOException {
		ExtentTest test = extent.createTest("MySecondTest", "Sample description");
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
		
	}
	
	@AfterTest
	public void teardown() {
		// calling flush writes everything to the log file
        extent.flush();
        driver.close();
	}
}
