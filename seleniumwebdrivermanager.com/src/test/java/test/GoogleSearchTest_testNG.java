package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest_testNG
{

	static WebDriver driver=null;
@BeforeTest//annotation
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
@Test
	public static void googleSearch()
	{ 
		//WebDriverManager.chromedriver().setup();
		//driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		//GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.close();
		//System.out.println("test completed");
	}
	@AfterTest
	public void tearDowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("test completed");
		
	}
}
