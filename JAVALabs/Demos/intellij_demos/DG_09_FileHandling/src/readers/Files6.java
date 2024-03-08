package readers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files6 {

    public static void main(String[] args) throws IOException{

        // Demo 9.06 - try with resources

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/readers/output.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.println("Enter a line of text");
            String line = br.readLine();
            while (!line.equals("stop")) {
                bw.write(line + "\n");		// Writes to output.txt
                System.out.println("Enter a new line of text or type stop to quit");
                line = br.readLine();		// Reads from console
            }
            bw.flush(); 					// Required
        }
    }
}
