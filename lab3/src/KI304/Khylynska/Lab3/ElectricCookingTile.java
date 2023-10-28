package KI304.Khylynska.Lab3;

import KI304.Khylynska.Lab3.CookingTile.Cooking;

/**
 * Subclass ElectricCookingTile that inherits from CookingTile and implements the Cooking interface.
 */
public class ElectricCookingTile extends CookingTile implements Cooking {
    /**
     * Constructor for ElectricCookingTile with parameters.
     *
     * @param material Material of the electric cooking tile.
     * @param size     Size of the electric cooking tile (in square centimeters).
     * @param hasTimer Whether the electric cooking tile has a timer.
     */
    public ElectricCookingTile(String material, double size, boolean hasTimer) {
        super(material, size, hasTimer);
    }

    /**
     * Implementation of the abstract method for cleaning the electric cooking tile.
     */
    @Override
    public void cleanTile() {
        logActivity("Cleaning the electric cooking tile.");
        // Add cleaning logic for the electric tile here.
        logActivity("Electric tile is clean.");
    }

    /**
     * Implementation of the method for cooking a dish on the electric cooking tile.
     *
     * @param dishName Name of the dish being cooked.
     */
    @Override
    public void cookDish(String dishName) {
        logActivity("Cooking " + dishName + " on the electric cooking tile.");
        // Add cooking logic for the electric tile here.
        logActivity(dishName + " is ready.");
    }
}