package org.example.kinds.party;

import org.example.categories.Pants;

/**
 * Represents party pants.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class PartyPants implements Pants {

  /**
   * Prints the style of party pants.
   */
  @Override
  public void getPantsStyle() {
    System.out.println("Pants are party");
  }
}
