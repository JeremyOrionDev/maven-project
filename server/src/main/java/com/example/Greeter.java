package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
 * comment
 * @param some parameters
 * @return one return
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
