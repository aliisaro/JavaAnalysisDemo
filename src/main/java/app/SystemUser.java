package app;

/**
 * Represents a user in the application system.
 */
public class SystemUser {

  private final String name;

  /**
   * Constructs a user with the specified name.
   *
   * @param name the name of the user.
   */
  public SystemUser(final String name) {
    this.name = name;
  }

  /**
   * Gets the name of the user.
   *
   * @return the name of the user.
   */
  public String getName() {
    return name;
  }
}
