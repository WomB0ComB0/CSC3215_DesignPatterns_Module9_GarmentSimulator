package org.example.kinds.party;

import org.example.categories.Shoes;

/**
 * Represents party shoes.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class PartyShoes implements Shoes {

    /**
     * Prints the style of party shoes.
     */
    @Override
    public void getShoeStyle() {
        System.out.println("Shoes are party");
    }
}