import static com.google.common.truth.Truth.assertThat;

import junit.framework.*;

public class TestOne extends TestCase {
  private int value1, value2;

  // assigning the values
  protected void setUp() {
    value1 = 3;
    value2 = 3;
  }

  // test method to add two values
  public void testAdd() {
    double result = value1 + value2;
    assertThat(result).isEqualTo(6);
  }
}
