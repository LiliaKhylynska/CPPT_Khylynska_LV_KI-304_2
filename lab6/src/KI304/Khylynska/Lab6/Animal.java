package KI304.Khylynska.Lab6;

/**
 *  Class representing an animal
 */
public class Animal {
    private String name;
    private double weight;

    /**
     * Constructor with parameters.
     * @param name Name of the animal
     * @param weight Weight of the animal
     */
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Method to get the name of animal.
     *
     * @return Name of the animal.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method to get the weight of animal.
     *
     * @return Weight of the animal.
     */
    public double getWeight() {
    	return weight;
    }
}