package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DataUtils;

public class ContactUsPage extends BasePage {
  private final String contactUsURL = "https://www.securepay.com.au/support/contact-us/";

  // Locators
  private final String firstNameLocator = "input[placeholder=\"First Name\"]";
  private final String lastNameLocator = "input[placeholder=\"Last Name\"]";
  private final String emailAddressLocator = "input[placeholder=\"Email Address\"]";
  private final String phoneNumberLocator = "input[placeholder=\"Phone Number\"]";
  private final String urlLocator = "input[placeholder=\"https://\"]";
  private final String companyNameLocator = "input[placeholder=\"Company\"]";
  private final String reasonDropDownLocator = "reason-for-enquiry";

  public void navigate() {
    getWebDriver().get(contactUsURL);
  }

  private void isPageLoaded() {
    WebDriverWait webDriverWait = new WebDriverWait(getWebDriver(), 5);
    webDriverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(firstNameLocator)));
  }

  public void enterContactFormDetails() {
    isPageLoaded();
    String firstName = DataUtils.generateRandomString(8);
    getWebDriver().findElement(By.cssSelector(firstNameLocator)).sendKeys(firstName);

    String lastName = DataUtils.generateRandomString(8);
    getWebDriver().findElement(By.cssSelector(lastNameLocator)).sendKeys(lastName);

    String emailAddress = DataUtils.generateEmailAddress(8);
    getWebDriver().findElement(By.cssSelector(emailAddressLocator)).sendKeys(emailAddress);

    String phoneNumber = DataUtils.generateRandomNumber(8);
    getWebDriver().findElement(By.cssSelector(phoneNumberLocator)).sendKeys(phoneNumber);

    String url = "https://".concat(DataUtils.generateRandomString(8)).concat(".com");
    getWebDriver().findElement(By.cssSelector(urlLocator)).sendKeys(url);

    String companyName = DataUtils.generateRandomString(8);
    getWebDriver().findElement(By.cssSelector(companyNameLocator)).sendKeys(companyName);

    Select drpReason = new Select(getWebDriver().findElement(By.name(reasonDropDownLocator)));
    drpReason.selectByVisibleText("Support");
  }
}
