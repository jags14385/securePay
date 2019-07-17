package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
  private static WebDriver driver;

  public static WebDriver getWebDriver() {
    if (null == driver) {
      try {
        System.setProperty("webdriver.chrome.driver", "src/lib/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return driver;
  }
}
