package KI304.Khylynska.Lab5;

import java.io.*;
import java.util.*;

/**
 * The <code>FioApp</code> class implements the driver for the CalcWFio class.
 */
public class FioApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Create an instance of CalcWFio
        CalcWFio obj = new CalcWFio();

        // Create a scanner to read user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter data
        System.out.print("Enter data: ");
        int data = s.nextInt();

        // Calculate the result and display it
        obj.calculate(data);
        System.out.println("Result is: " + obj.getResult());

        // Write the result to a text file
        obj.writeResTxt("textRes.txt");

        // Write the result to a binary file
        obj.writeResBin("BinRes.bin");

        // Read the result from the binary file and display it
        obj.readResBin("BinRes.bin");
        System.out.println("Result is: " + obj.getResult());

        // Read the result from the text file and display it
        obj.readResTxt("textRes.txt");
        System.out.println("Result is: " + obj.getResult());
    }
}
