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

    //      driver.get("https://www.securepay.com.au/support/contact-us/");
    //      driver.findElement(By.cssSelector("input[placeholder=\"First
    // Name\"]")).sendKeys("ghdjgdj");
    //      driver.findElement(By.cssSelector("input[placeholder=\"Last
    // Name\"]")).sendKeys("ghdjgdj");
    //      driver
    //              .findElement(By.cssSelector("input[placeholder=\"Email Address\"]"))
    //              .sendKeys("ghdjgdj@eample.com");
    //      driver
    //              .findElement(By.cssSelector("input[placeholder=\"Phone Number\"]"))
    //              .sendKeys("+61400000000");
    //
    // driver.findElement(By.cssSelector("input[placeholder=\"https://\"]")).sendKeys("ghdjgdj");
    //      driver.findElement(By.cssSelector("input[placeholder=\"Company\"]")).sendKeys("Some
    // Company");
    //      Select drpReason = new Select(driver.findElement(By.name("reason-for-enquiry")));
    //      drpReason.selectByVisibleText("Accounts");
  }
}
