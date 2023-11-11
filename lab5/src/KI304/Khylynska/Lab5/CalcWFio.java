package KI304.Khylynska.Lab5;

import java.io.*;
import java.util.*;

/**
 * The <code>CalcWFio</code> class implements the file input and output.
 */
public class CalcWFio {
    private double result;

    /**
     * Method to write the result to a text file
     * @param fName The name of the file in which the result is written
     */
   
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", result);
        f.close();
    }

    /**
     * Method to read the result from a text file
     * @param fName The name of the file in which the result is read
     */
    
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method to write the result to a binary file
     * @param fName The name of the binary file in which the result is written
     */
    
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }
    
    /**
     * Method to read the result from a binary file
     * @param fName The name of the binary file in which the result is read
     * @throws FileNotFoundException
     * @throws IOException
     */
    
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Method to calculate the result
     * @param x The value
     */
   
    public void calculate(int x) {
    	Equations eq = new Equations();
    	try 
    	{
    		result = eq.calculate(x);
    	} catch (CalcException ex) {
	        // This block handles calculation errors
	        System.out.print(ex.getMessage());
	    }
        
    }

    /**
     * Method to get the calculated result
     * @return The calculated result
     */
   
    public double getResult() {
        return result;
    }
}
