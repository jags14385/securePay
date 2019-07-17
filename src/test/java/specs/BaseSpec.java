package specs;

import junit.framework.TestCase;
import pages.BasePage;

public class BaseSpec extends TestCase {
  protected void tearDown() {
    BasePage.getWebDriver().quit();
  }
}
