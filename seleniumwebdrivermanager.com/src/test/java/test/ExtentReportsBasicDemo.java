package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo
{
	static WebDriver driver=null;
	public static void main(String[] args)
	{
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extent.htm");
	   ExtentReports extent= new ExtentReports();
	   extent.attachReporter(htmlReporter);
	   ExtentTest test1= extent.createTest("google search test 1","google search functionality");
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       test1.log(Status.INFO,"starting test case");
       driver.get("http://www.google.co.in");
       test1.pass("navigated to google");
       driver.findElement(By.name("q")).sendKeys("abcd");
       test1.pass("entered text on google");
       test1.pass("Pressed enter");
       driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
       driver.close();
       driver.quit();
       test1.fail("closed the browser");
       //intentionally failed this case, we have to manually to if else to categorrise pass/fail in future
       test1.info("test completed");
       extent.flush();// to actually create a report
        
	
	}

}
