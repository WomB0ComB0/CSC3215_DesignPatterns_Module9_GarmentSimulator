package org.example.kinds.professional;

import org.example.categories.Shoes;

/**
 * Represents professional shoes.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class ProfessionalShoes implements Shoes {

    /**
     * Prints the style of professional shoes.
     */
    @Override
    public void getShoeStyle() {
        System.out.println("Shoes are professional");
    }
}