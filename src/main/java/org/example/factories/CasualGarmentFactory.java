package org.example.factories;

import org.example.categories.*;
import org.example.kinds.casual.*;

/**
 * Factory for creating casual garments.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class CasualGarmentFactory implements GarmentSetFactory {

    /**
     * Creates casual tops.
     * 
     * @return casual tops
     */
    @Override
    public Tops createTops() {
        return new CasualTops();
    }

    /**
     * Creates casual pants.
     * 
     * @return casual pants
     */
    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    /**
     * Creates casual shoes.
     * 
     * @return casual shoes
     */
    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
