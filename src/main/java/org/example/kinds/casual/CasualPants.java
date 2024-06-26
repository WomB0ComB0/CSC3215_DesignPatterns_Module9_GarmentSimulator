package org.example.kinds.casual;

import org.example.categories.Pants;

/**
 * Represents casual pants.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class CasualPants implements Pants {

    /**
     * Prints the style of casual pants.
     */
    @Override
    public void getPantsStyle() {
        System.out.println("Pants are casual");
    }
}
