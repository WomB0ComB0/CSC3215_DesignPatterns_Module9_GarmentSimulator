package org.example.factories;

import org.example.categories.*;

/**
 * Abstract factory interface for creating sets of garments.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public interface GarmentSetFactory {

    /**
     * Creates a top.
     * 
     * @return a top
     */
    Tops createTops();

    /**
     * Creates pants.
     * 
     * @return pants
     */
    Pants createPants();

    /**
     * Creates shoes.
     * 
     * @return shoes
     */
    Shoes createShoes();
}
