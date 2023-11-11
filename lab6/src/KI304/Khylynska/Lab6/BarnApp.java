package KI304.Khylynska.Lab6;

/**
 * The <code>BarnApp</code> class implements the driver for the <code>Barn</code> class.
 *
 */

public class BarnApp {
    public static void main(String[] args) {
        // Create a barn for cows
        Barn<Cow> cowBarn = new Barn<>();
        
        // Add cows to the barn
        cowBarn.addAnimal(new Cow("Cow 1", 737));
        cowBarn.addAnimal(new Cow("Cow 2", 731));
        cowBarn.addAnimal(new Cow("Cow 3", 702));
        cowBarn.addAnimal(new Cow("Cow 4", 733));

        // Find the smallest cow
        Cow smallestCow = cowBarn.findSmallestAnimal();
        if (smallestCow != null) {
            System.out.println("Smallest cow: " + smallestCow.getName());
        }

        // Find the largest cow
        Cow largestCow = cowBarn.findLargestAnimal();
        if (largestCow != null) {
            System.out.println("Largest cow: " + largestCow.getName());
        }
    }
}