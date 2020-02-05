package MB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SellerManagement2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2stg.magicbricks.com/sellermanagement/welcomemodule/welcomecall");
	    driver.findElement(By.id("parentPackage")).click();
	    driver.findElement(By.id("recomTab")).click();
	    driver.findElement(By.xpath("//div[@id='rootResponsive']/div/div")).click();
	    driver.findElement(By.linkText("Calling screen module")).click();
	    driver.findElement(By.id("parentPackage")).click();
	    new Select(driver.findElement(By.id("parentPackage"))).selectByVisibleText("16886853 - AMS Superstar for 12 Months for Owners - Rs.850.0 - Valid Till 2021-01-31 13:04:34.0");
	    driver.findElement(By.id("parentPackage")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("upsellingButton")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("upsellingButton")).click();
	    driver.findElement(By.id("username")).click();
	    driver.findElement(By.id("username")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=username | ]]
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("test@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=password | ]]
	    driver.findElement(By.id("loginSubmit")).click();
	    driver.findElement(By.linkText("Welcome Calling Module")).click();
	    driver.findElement(By.name("loginIdToSearch")).click();
	    driver.findElement(By.name("loginIdToSearch")).clear();
	    driver.findElement(By.name("loginIdToSearch")).sendKeys("freeowner02@gmail.com");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("upsellingButton")).click();

		// WebDriverWait wait3 = new WebDriverWait(driver, 20);
		// WebElement
		// element2=wait3.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[@id='upsellingButton']"))));
		// wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@id='upsellingButton']")));

		// WebElement
		// element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='upsellingButton']")));
		// Thread.sleep(2000);
		// iver.findElement(By.id("upsellingButton")).click();
		// driver.findElement(By.id("parentPackage")).click();
		System.out.println("clicked upselling");

	}

}
