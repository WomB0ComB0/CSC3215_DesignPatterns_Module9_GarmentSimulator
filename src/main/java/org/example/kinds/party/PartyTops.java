package org.example.kinds.party;

import org.example.categories.Tops;

/**
 * Represents party tops.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class PartyTops implements Tops {

    /**
     * Prints the style of party tops.
     */
    @Override
    public void getTopsStyle() {
        System.out.println("Tops are party");
    }

}
