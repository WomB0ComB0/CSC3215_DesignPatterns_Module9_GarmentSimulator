package org.example.kinds.professional;

import org.example.categories.Pants;

/**
 * Represents professional pants.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class ProfessionalPants implements Pants {

    /**
     * Prints the style of professional pants.
     */
    @Override
    public void getPantsStyle() {
        System.out.println("Pants are professional");
    }
}
