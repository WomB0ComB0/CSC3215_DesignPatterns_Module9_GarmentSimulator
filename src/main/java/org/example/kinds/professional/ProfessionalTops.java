package org.example.kinds.professional;

import org.example.categories.Tops;

/**
 * Represents professional tops.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class ProfessionalTops implements Tops {

    /**
     * Prints the style of professional tops.
     */
    @Override
    public void getTopsStyle() {
        System.out.println("Tops are professional");
    }
}
