import junit.framework.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class TestOne extends TestCase {
  private WebDriver driver;

  protected void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/lib/chromedriver");
    driver = new ChromeDriver();
  }

  public void testAdd() throws InterruptedException {
    driver.get("https://www.google.com");
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("SecurePay");
    searchBox.submit();
    sleep(2000);  // Let the user actually see something!
    driver.quit();
  }
}
