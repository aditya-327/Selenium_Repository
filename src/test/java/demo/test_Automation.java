package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.All_Links;

public class test_Automation implements All_Links{
//	ExtentReports extentReports;
//	ExtentTest extentTest;
	WebDriver driver;
	
	@BeforeTest
	void Open_Browser() {
		
//		extentReports = new ExtentReports(report_url+"test_Automation_Report");
//		extentTest = extentReports.startTest("Test Application");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(base_url);
		driver.manage().window().maximize();
	}
	
	@Test
	void home_Page() {
		WebElement txt = driver.findElement(By.xpath(home_xpath));
		String h_txt = txt.getText();
		System.out.println(h_txt);
		
		if(h_txt.equals(Act_result)) {
//			extentTest.log(LogStatus.PASS, " Home Page is Visible Successfully....");
			System.out.println("Home Page is Visible Successfully....");
		}
		else {
//			extentTest.log(LogStatus.PASS, " Home Page is Not Visible Successfully....");
			System.out.println("Home Page is Visible Successfully....");
		}
		
//		extentReports.endTest(extentTest);
//		extentReports.flush();
	}
	
	@AfterTest
	void Down() {
		driver.quit();
	}
}
