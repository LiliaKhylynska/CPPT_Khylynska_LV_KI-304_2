package KI304.Khylynska.Lab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class that describes a cooking tile.
 */
public class CookingTile {
    private String material;
    private double size;
    private boolean hasTimer;

    /**
     * Constructor with parameters.
     *
     * @param material Material of the cooking tile.
     * @param size Size of the cooking tile (in square centimeters).
     * @param hasTimer Whether the cooking tile has a timer.
     */
    public CookingTile(String material, double size, boolean hasTimer) {
        this.material = material;
        this.size = size;
        this.hasTimer = hasTimer;
    }

    /**
     * Default constructor that initializes the cooking tile with default values.
     */
    public CookingTile() {
        this.material = "Ceramic";
        this.size = 50.0;
        this.hasTimer = false;
    }

    /**
     * Method to set the material of the cooking tile.
     *
     * @param material New material of the cooking tile.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Method to get the material of the cooking tile.
     *
     * @return Material of the cooking tile.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Method to set the size of the cooking tile.
     *
     * @param size New size of the cooking tile (in square centimeters).
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Method to get the size of the cooking tile.
     *
     * @return Size of the cooking tile (in square centimeters).
     */
    public double getSize() {
        return size;
    }

    /**
     * Method to check if the cooking tile has a timer.
     *
     * @return True if the cooking tile has a timer, false otherwise.
     */
    public boolean hasTimer() {
        return hasTimer;
    }

    /**
     * Method to turn on the timer of the cooking tile.
     */
    public void turnOnTimer() {
        hasTimer = true;
    }

    /**
     * Method to turn off the timer of the cooking tile.
     */
    public void turnOffTimer() {
        hasTimer = false;
    }

    /**
     * Method to cook a dish on the cooking tile.
     *
     * @param dishName Name of the dish to be cooked.
     */
    public void cookDish(String dishName) {
        logActivity("Cooking " + dishName + " on the tile.");
        // Add cooking logic here.
        logActivity(dishName + " is ready.");
    }

    /**
     * Method to clean the cooking tile.
     */
    public void cleanTile() {
        logActivity("Cleaning the tile.");
        // Add cleaning logic here.
        logActivity("Tile is clean.");
    }


    /**
     * Method to record activity log to a file.
     *
     * @param log Message to be written to the log.
     */
    public void logActivity(String log) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write(log);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
