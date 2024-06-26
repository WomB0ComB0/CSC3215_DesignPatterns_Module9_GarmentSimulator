package org.example.kinds.casual;

import org.example.categories.Shoes;

/**
 * Represents casual shoes.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class CasualShoes implements Shoes {

    /**
     * Prints the style of casual shoes.
     */
    @Override
    public void getShoeStyle() {
        System.out.println("Shoes are casual");
    }
}
