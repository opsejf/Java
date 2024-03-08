package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomException {

    public static void main(String[] args) throws IOException, BadLineException {

        // To put null input on Mac/Linux and ItelliJ use CTRL+D
        // On other Windows, use CTRL+Z (or CTRL+Z+Enter)

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a new line of text");
            String line = br.readLine();
            while (line != null) {
                // Demo 8.06 - Throw custom exception
                if(line.equals("no")) {
                    throw new BadLineException("Line said no", line);
                }
                System.out.println(line);
                System.out.println("Enter a new line of text");
                line = br.readLine();
            }
        }
        finally {
            try {
                if(br != null) br.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("I've executed!");
        }
    }
}
