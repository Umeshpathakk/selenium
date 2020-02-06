package MB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SellerManagement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://ec2stg.magicbricks.com/mboauth/login");
		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("loginSubmit")).sendKeys(Keys.RETURN);
		// driver.findElement(By.xpath("//a[contains(text(),'Seller
		// Management')])")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.linkText("Welcome Calling Module")).click();
		// action.moveToElement(elementToHover).click(elementToClick).build().perform();
		driver.findElement(By.name("loginIdToSearch")).sendKeys("freeowner02@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("upsellingButton")).click();
		// driver.findElement(By.xpath("//a[@id='upsellingButton']")).click();
		System.out.println("reached upto upselling");
		//WebDriverWait wait = new WebDriverWait(driver, 60);
	//	wait.until(ExpectedConditions(By.xpath("//a[@id='upsellingButton']").)).click();
		//Wait<WebDriver> wait = new FluentWait <WebDriver>(driver)
			//	.withTimeout(15,TimeUnit.SECONDS)
			//	.pollingEvery(5,TimeUnit.SECONDS)
			//	.ignoring(Exception.class);

		// WebDriverWait wait3 = new WebDriverWait(driver, 20);
		// WebElement
		// element2=wait3.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[@id='upsellingButton']"))));
		// wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[@id='upsellingButton']")));

		// WebElement
		// element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='upsellingButton']")));
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// iver.findElement(By.id("upsellingButton")).click();
		// driver.findElement(By.id("parentPackage")).click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='upsellingButton']"))).click();
	driver.findElement(By.xpath("//a[@id='upsellingButton']")).click();
		System.out.println("clicked upselling");
		
		
		
		//driver.findElement(By.id("parentPackage")).selectByVisibleText("16886853 - AMS Superstar for 12 Months for Owners - Rs.850.0 - Valid Till 2021-01-31 13:04:34.0");
		Select s=new Select(driver.findElement(By.id("parentPackage")));
		
		String str="16888422 - 5 premium listing in 1 year - Rs.429.0 - Valid Till 2020-11-14 15:35:32.0";
		s.selectByVisibleText(str);
		//driver.findElement(By.linkText("16888422 - 5 premium listing in 1 year - Rs.429.0 - Valid Till 2020-11-14 15:35:32.0")).click();
		driver.findElement(By.xpath("//div[@class='container']//div[3]//div[2]//div[2]//div[4]//div[1]//div[1]//input[1]")).sendKeys("950");
		Select s2=new Select(driver.findElement(By.xpath("//div[@class='container']//div[3]//div[2]//div[2]//div[6]//div[1]//div[1]//select[1]")));
		s2.selectByVisibleText("Interested");
				
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[21]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//div[@class='paymentM_row']//div[@class='addToCart']//div//input")).click();
		//driver.switchTo().alert().sendKeys("Keys.RETURN");
	//	driver.switchTo().alert().sendKeys("Keys.RETURN");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	//	driver.switchTo().alert().sendKeys("Keys.RETURN");
		driver.switchTo().alert().accept();
		String typedText = driver.findElement(By.xpath("//input[@id='paymentlink']")).getAttribute("value");
		driver.get(typedText);
		
		String value = driver.findElement(By.xpath("//label[@class='makeMeH']")).getText();
		if (str.contains(value))
		{
			System.out.println("test passed");
		}
		
		//System.out.println(value);
		//s.selectByIndex(1);
	
		

	}

}
