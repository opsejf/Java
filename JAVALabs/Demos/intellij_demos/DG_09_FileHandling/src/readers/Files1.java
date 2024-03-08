package readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Files1 {

    public static void main(String[] args) throws IOException {

        //Demo 9.01 - BufferedReader, InputStreamReader and FileInputStream

        // FileInputStream handles raw binary data - byte stream class
        // BufferedReader and InputStreamReader belong to character stream category
        // InputStreamReader builds bridge between FileInputStream and BufferedReader

        BufferedReader br = null;
        FileInputStream is = null;
        is = new FileInputStream("src/readers/input.txt");
        // BufferedReader with InputStreamReader allows us to access lines
        br = new BufferedReader(new InputStreamReader(is));
        // Use BufferedReader...
        System.out.println("Get first line: " + br.readLine());

        if (br!=null) br.close();

        if (is!=null) is.close();

        System.out.println("Processing input.txt using a BufferedReader");
        String line = null;
        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("src/readers/input.txt")))) {
            while ((line = br2.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error processing input file src/readers/input.txt: " + e);
        }

        System.out.println("Processing input.txt using a Scanner");
        line = null;
        try(Scanner s = new Scanner( new BufferedReader(new InputStreamReader(new FileInputStream("src/readers/input.txt"))))) {
            while (s.hasNext() ) {
                System.out.println(s.next());
            }
        } catch (IOException e) {
            System.err.println("Error processing input file src/readers/input.txt: " + e);
        }


    }
}
