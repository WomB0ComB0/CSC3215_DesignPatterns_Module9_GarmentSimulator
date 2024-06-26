package org.example.factories;

import org.example.categories.*;
import org.example.kinds.party.*;

/**
 * Factory for creating party garments.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class PartyGarmentFactory implements GarmentSetFactory {

    /**
     * Creates party tops.
     * 
     * @return party tops
     */
    @Override
    public Tops createTops() {
        return new PartyTops();
    }

    /**
     * Creates party pants.
     * 
     * @return party pants
     */
    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    /**
     * Creates party shoes.
     * 
     * @return party shoes
     */
    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
