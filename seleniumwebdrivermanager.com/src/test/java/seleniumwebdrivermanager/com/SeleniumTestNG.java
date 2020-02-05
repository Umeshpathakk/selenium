package seleniumwebdrivermanager.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNG 
{

	public static void main(String[] args)
	{  
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		//WebElement txtbox= driver.findElement(By.name("q"));
		//txtbox.sendKeys("magicbricks");
		
	  // driver.findElement(By.name("q")).sendKeys("magicbricks");
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("magicbricks");
	   driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	   driver.findElement(By.xpath("//h3[@class='sA5rQ']")).click();
	   driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[5]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[5]/div[2]/div[3]/div[1]/h3[1]/span[1]")).click()
	   ;
	 // driver.findElement(By.name("btnk")).click();
	  // Thread.sleep(4000);  name("btnk")).click();
	   
		
		//driver.close();
		//driver.quit();	

	}

}
