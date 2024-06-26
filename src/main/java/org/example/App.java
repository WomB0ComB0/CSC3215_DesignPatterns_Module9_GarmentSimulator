package org.example;

import org.example.categories.Pants;
import org.example.categories.Shoes;
import org.example.categories.Tops;
import org.example.factories.GarmentSetFactory;

/**
 * The main application class that initializes and reveals the content of
 * garments.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class App {
    private Pants pants;
    private Tops tops;
    private Shoes shoes;

    /**
     * Constructs an App instance with garments created by the specified factory.
     * 
     * @param factory the factory to create garments
     */
    public App(GarmentSetFactory factory) {
        pants = factory.createPants();
        tops = factory.createTops();
        shoes = factory.createShoes();
    }

    /**
     * Reveals the styles of the tops, pants, and shoes.
     */
    public void revealContent() {
        tops.getTopsStyle();
        pants.getPantsStyle();
        shoes.getShoeStyle();
    }

    /**
     * Runs the application.
     */
    public void run() {
        revealContent();
    }
}
