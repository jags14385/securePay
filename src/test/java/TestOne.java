import static com.google.common.truth.Truth.assertThat;

import junit.framework.*;
import org.junit.Test;

public class TestOne extends TestCase {
  private int value1, value2;

  protected void setUp() {
    value1 = 3;
    value2 = 3;
  }

  @Test
  public void testAdd() {
    double result = value1 + value2;
    assertThat(result).isEqualTo(6);
  }
}
