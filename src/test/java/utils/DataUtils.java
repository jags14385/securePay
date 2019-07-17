package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class DataUtils {

  public static String generateRandomString(int length) {
    return RandomStringUtils.randomAlphabetic(length);
  }

  public static String generateEmailAddress(int length) {
    String allowedChars =
        "abcdefghijklmnopqrstuvwxyz"
            + // alphabets
            "1234567890"
            + // numbers
            "_-."; // special characters
    String email = RandomStringUtils.random(length, allowedChars);
    // Example.com is a safe domain.
    return email.concat("@example.com");
  }

  public static String generateRandomNumber(int length) {
    return "04" + RandomStringUtils.randomNumeric(length);
  }
}
