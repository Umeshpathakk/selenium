package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest
{

	static WebDriver driver=null;
	public static void main(String[] args)
	{
		googleSearch();
	}

	public static void googleSearch()
	{ 
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		//driver.findElement(By.name("q")).sendKeys("automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("automation step by step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("test completed");
	}
}
