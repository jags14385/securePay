package specs;

import pages.ContactUsPage;
import pages.HomePage;

public class SecurePaySpec extends BaseSpec {
  private HomePage homePage;
  private ContactUsPage contactUsPage;

  protected void setUp() {
    homePage = new HomePage();
    contactUsPage = new ContactUsPage();
  }

  public void testShouldEnterContactFormDetailsSuccessfully() {
    homePage.navigate();
    contactUsPage.navigate();
    contactUsPage.enterContactFormDetails();
  }
}
