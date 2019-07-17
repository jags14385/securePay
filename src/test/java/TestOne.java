import junit.framework.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestOne extends TestCase {
  private WebDriver driver;

  protected void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    driver = new ChromeDriver();
  }

  public void testAdd() {
    driver.get("https://google.com.au");
  }
}
