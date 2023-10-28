package KI304.Khylynska.Lab3;

public class ElectricCookingTileDemo {
    public static void main(String[] args) {
        // Create an electric cooking tile
        ElectricCookingTile electricTile = new ElectricCookingTile("Ceramic", 60.0, true);

        // Turn on the timer
        if (!electricTile.hasTimer()) {
            electricTile.turnOnTimer();
            System.out.println("Timer is now on.");
        }

        // Cook a dish on the electric tile
        electricTile.cookDish("Pasta");

        // Clean the electric tile after cooking
        electricTile.cleanTile();

        // Turn off the timer
        electricTile.turnOffTimer();
        System.out.println("Timer is now off.");

        // Log activity
        electricTile.logActivity("Finish cooking dinner.");
    }
}
