package readers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files5 {

    public static void main(String[] args) throws IOException{

        // Demo 9.05 - Throwing the Exceptions
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/readers/output.txt"));
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a line of text");
            String line = br.readLine();
            while (!line.equals("stop")) {
                bw.write(line + "\n");		// Writes to output.txt
                System.out.println("Enter a new line of text or type stop to quit");
                line = br.readLine();		// Reads from console
            }
            bw.flush(); 					// Required
        }
        finally {
            if (br != null) br.close();
            if (bw != null) bw.close();
        }
    }
}
