 package KI304.Khylynska.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
* Class representing a barn
*/
 public class Barn<T extends Animal> {
    private List<T> animals = new ArrayList<>();

    
    /**
     * Add an animal to the barn 
     * @param animal The animal that is added
     */
    public void addAnimal(T animal) {
        animals.add(animal);
    }

    /**
     * Remove an animal from the barn 
     * @param animal The animal that is removed
     */
    
    public void removeAnimal(T animal) {
        animals.remove(animal);
    }
    
    /**
     * Find the smallest animal in the barn 
     * @return  The smallest animal in the barn 
     */
    
    public T findSmallestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }

        T smallestAnimal = animals.get(0);
        for (T animal : animals) {
            if (animal.getWeight() < smallestAnimal.getWeight()) {
                smallestAnimal = animal;
            }
        }
        return smallestAnimal;
    }

    /**
     * Find the largest animal in the barn
     * @return The largest animal in the barn
     */
  
    public T findLargestAnimal() {
        if (animals.isEmpty()) {
            return null;
        }

        T largestAnimal = animals.get(0);
        for (T animal : animals) {
            if (animal.getWeight() > largestAnimal.getWeight()) {
                largestAnimal = animal;
            }
        }
        return largestAnimal;
    }
}