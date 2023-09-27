import KI304.Khylynska.Lab2.CookingTile;

/**
 * @author Lenovo
 *
 */
public class CookingTileApp {
	/**
     * Main method for testing and demonstrating the functionality of the CookingTile class.
     */
    public static void main(String[] args) {
        CookingTile tile = new CookingTile("Ceramic", 60.0, true);
        tile.logActivity("Start cooking lunch.");
        
     // Check if the tile has a timer and turn it on
        if (!tile.hasTimer()) {
            tile.turnOnTimer();
            System.out.println("Timer is now on.");
        }

        // Cook a dish on the tile
        tile.cookDish("Pasta");

        // Clean the tile after cooking
        tile.cleanTile();

        // Turn off the timer
        tile.turnOffTimer();
        System.out.println("Timer is now off.");

        tile.logActivity("Finish cooking lunch.");
    }
}
