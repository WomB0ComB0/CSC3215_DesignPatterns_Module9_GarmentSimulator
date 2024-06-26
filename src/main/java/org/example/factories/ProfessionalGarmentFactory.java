package org.example.factories;

import org.example.categories.*;
import org.example.kinds.professional.*;

/**
 * Factory for creating professional garments.
 * 
 * @author Mike Odnis
 * @since 06/26/2024
 * @version 1.0
 */
public class ProfessionalGarmentFactory implements GarmentSetFactory {

    /**
     * Creates professional tops.
     * 
     * @return professional tops
     */
    @Override
    public Tops createTops() {
        return new ProfessionalTops();
    }

    /**
     * Creates professional pants.
     * 
     * @return professional pants
     */
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    /**
     * Creates professional shoes.
     * 
     * @return professional shoes
     */
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
