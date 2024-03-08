package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_TryCatchFileIO {

    public static void main(String[] args) throws Exception{

        // Demo 8.02 - Try Catch with FileIO
        // To put null input on Mac/Linux, and IntelliJ use CTRL+D
        // On Windows, use CTRL + Z (or CTRL+Z+Enter) - & it sometimes works - best if you click outside the console window then back inside first???

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a new line of text");
            String line = br.readLine();
            int[] x = new int[3];
            x[1] = 0;
            while (line != null) {
                System.out.println(line);
                System.out.println("Enter a new line of text");
                line = br.readLine();
            }
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
            e = new ArrayIndexOutOfBoundsException();
            throw e;
        }
        finally {
            try {
                if(br != null) br.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
