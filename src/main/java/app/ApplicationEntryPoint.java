package app;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The entry point for the application.
 * This class contains static utility methods for application execution.
 */
public final class ApplicationEntryPoint {

  private static final Logger LOGGER = Logger.getLogger(ApplicationEntryPoint.class.getName());

  // Private constructor to prevent instantiation
  private ApplicationEntryPoint() {
    throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
  }

  /**
   * The main method is the entry point of the application.
   *
   * @param args command-line arguments.
   */
  public static void main(final String[] args) {
    if (LOGGER.isLoggable(Level.INFO)) {
      LOGGER.info("Application started");
    }

    final StringBuilder output = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      output.append(i).append('\n');
    }

    if (LOGGER.isLoggable(Level.INFO)) {
      LOGGER.info(output.toString());
    }

    final SystemUser user = new SystemUser("Alice");
    if (LOGGER.isLoggable(Level.INFO)) {
      LOGGER.info(String.format("User's name: %s", user.getName()));
    }
  }

  /**
   * Divides two integers and logs the result.
   *
   * @param dividend the dividend.
   * @param divisor  the divisor.
   * @throws ArithmeticException if divisor is 0.
   */
  public static void divide(final int dividend, final int divisor) {
    if (divisor == 0) {
      LOGGER.warning("Division by zero is not allowed.");
      throw new ArithmeticException("Division by zero");
    }
    if (LOGGER.isLoggable(Level.INFO)) {
      LOGGER.info(String.format("Result: %d", dividend / divisor));
    }
  }
}
