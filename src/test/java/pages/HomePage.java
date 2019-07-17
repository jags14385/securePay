package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
  // Data
  private final String GOOGLE_URL = "https://www.google.com";
  private final String searchKeyWord = "SecurePay";
  // Locators
  private final String linkLocator = "a[href*=\"https://www.securepay.com.au\"]";

  public void navigate() {
    getWebDriver().get(GOOGLE_URL);
    WebElement searchBox = getWebDriver().findElement(By.name("q"));
    searchBox.sendKeys(searchKeyWord);
    searchBox.submit();
    getWebDriver().findElement(By.cssSelector(linkLocator)).click();
  }
}
