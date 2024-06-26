package org.example;

import org.example.factories.*;

/**
 * Driver class for the application.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class GarmentSimulator {
  /**
   * Main method for the driver class.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /**
     * Creates a new instance of the ProfessionalGarmentFactory class.
     */
    GarmentSetFactory professionalFactory = new ProfessionalGarmentFactory();
    /**
     * Creates a new instance of the CasualGarmentFactory class.
     */
    GarmentSetFactory casualFactory = new CasualGarmentFactory();
    /**
     * Creates a new instance of the PartyGarmentFactory class.
     */
    GarmentSetFactory partyFactory = new PartyGarmentFactory();

    /**
     * Creates a new instance of the App class with a new instance of the
     * ProfessionalGarmentFactory class.
     */
    App professionalApp = new App(professionalFactory);
    /**
     * Creates a new instance of the App class with a new instance of the
     * CasualGarmentFactory class.
     */
    App casualApp = new App(casualFactory);
    /**
     * Creates a new instance of the App class with a new instance of the
     * PartyGarmentFactory class.
     */
    App partyApp = new App(partyFactory);

    /**
     * Prints the content of the ProfessionalGarmentFactory class.
     */
    System.out.println("Professional Garments:");
    professionalApp.revealContent();

    /**
     * Prints the content of the CasualGarmentFactory class.
     */
    System.out.println("\nCasual Garments:");
    casualApp.revealContent();

    /**
     * Prints the content of the PartyGarmentFactory class.
     */
    System.out.println("\nParty Garments:");
    partyApp.revealContent();
  }
}