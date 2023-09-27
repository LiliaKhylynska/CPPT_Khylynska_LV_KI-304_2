import java.io.*;
import java.util.*;

/**
 * The Lab1KhylynskaKI304 class implements a sample program for laboratory work #1.
 */
public class Lab1KhylynskaKI304 {
	/**
     * The main static method is the entry point of the program.
     *
     * @param args command-line arguments (not used in this case)
     * @throws FileNotFoundException an exception that may occur if the file is not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        arr = new char[nRows][];
        int halfNRows = (nRows % 2 == 0) ? nRows / 2 : nRows / 2 + 1;
        for (int i = 0; i < halfNRows; i++) {
            arr[i] = new char[nRows - i];
        }
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; i + j <= nRows - 1; j++) {
                if (filler.length() == 1) {
                    if (i < j + 1){
                        arr[i][j] = (char) filler.codePointAt(0);
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                    else {
                        System.out.print("  ");
                        fout.print("  ");
                    }
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
