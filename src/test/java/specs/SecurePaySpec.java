package specs;

import pages.HomePage;

public class SecurePaySpec extends BaseSpec {
  private HomePage homePage;

  protected void setUp() {
    homePage = new HomePage();
  }

  public void testAdd() {
    homePage.navigate();
  }
}
