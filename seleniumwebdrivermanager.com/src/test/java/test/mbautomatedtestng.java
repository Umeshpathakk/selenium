package test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
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
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
