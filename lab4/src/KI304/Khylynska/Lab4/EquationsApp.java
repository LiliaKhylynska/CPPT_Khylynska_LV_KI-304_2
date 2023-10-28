package KI304.Khylynska.Lab4;

import java.io.*;
import java.util.*;

/**
 * The <code>EquationsApp</code> class implements the driver for the Equations class.
 * @author EOM Stuff
 * @version 1.0
 */
public class EquationsApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            // Prompt the user to enter a file name
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    // Prompt the user to enter a value for X
                    System.out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
                    // This block will be executed under any circumstances
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                // This block handles calculation errors
                System.out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            // This block handles file-related errors, even if they occur in the finally block
            System.out.print("Exception reason: Perhaps the wrong file path");
        }
    }
}
