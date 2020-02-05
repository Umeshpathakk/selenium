package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest 
{
	public static  WebDriver driver=null;
	public static void main(String[] args)
	{
		googleSearchTest();
	}
	public static  void googleSearchTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
       driver.get("http://www.google.co.in");
       searchPageObj.setTextInSearchBox("A B C D");
      searchPageObj.clicksSearchButton();
      driver.close();
	}

}
