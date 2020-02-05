package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsForTestNG
{
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver=null;
	@BeforeSuite
	public void setup()
	{
		htmlReporter =new ExtentHtmlReporter("extent.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	@Test
	public void test1() throws IOException
	{
		ExtentTest test=extent.createTest("First test","sample description");
		driver.get("http://www.google.co.in");
		test.pass("navigated to google");
		driver.findElement(By.name("q")).sendKeys("abcd");
		test.pass("entered text on google");
		test.pass("Pressed enter");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		test.log(Status.INFO, "This step shows usage of log(status,detail)");
		test.info("this step shows usage of info(details)");

		test.pass("details");
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDownTest()
	{
		System.out.println("in teardowntest");
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}
	@AfterSuite
	public void tearDown()
	{ 
		System.out.println("in teardown");
		extent.flush();
	} 

}
