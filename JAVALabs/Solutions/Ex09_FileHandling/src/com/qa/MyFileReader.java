package com.qa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

//Ex1 Task 1-2
public class MyFileReader {
    public static void main(String[] args) {
        // Ex1 Task2-6
        MyFileReader mfr = new MyFileReader();
        mfr.readAndPrint();
        // Ex2 Task1-6
        mfr.writeMyFile();
        // Ex3 Task2-6
        try {
            // Ex3 Task1-6
            mfr.readMyFile();
        } catch (BadLineException e) {
            // Ex3 Task1-7
            System.out.println(e + " - " + e.getTextLine());
        }
    }
    public MyFileReader(){

    }
    //Ex1 Task 2-1
    public void readAndPrint() {
        //Ex1 Task 2-2
        File myFile = new File("C:/JAVALabs/Labs/Resources/Sherlock.txt");
        //Ex1 Task 2-3
        try(BufferedReader br = new BufferedReader(new FileReader(myFile));) {
            // Ex1 Task 2-4
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            // Ex1 Task 2-5
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + myFile);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Generic Reading Error");
            e.printStackTrace();
        }
    }
// Ex2 Task1-1
    public void writeMyFile() {
    // Ex2 Task1-2
        String myFileName = "C:/JAVALabs/Labs/Resources/MyOutputFile.txt";
        // Ex2 Task1-3
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(myFileName));) {
            // Ex2 Task1-4
            System.out.println("Writing to " + myFileName);
            for (int counter = 0; counter < 100; counter++) {
                bw.append("This is line: " + counter + "\n");
            }
            System.out.println("Finished writing to " + myFileName);
        // Ex2 Task1-5
        } catch (IOException e) {
            System.out.println("Caught an IO exception");
             e.printStackTrace();
         }
    }
    // Ex3 Task1-2          Ex3 Task2-4
    public void readMyFile() throws BadLineException {
        // Ex3 Task1-3
        String myFileName = "C:/JAVALabs/Labs/Resources/MyOutputFile.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(myFileName));) {
            // Ex3 Task1-4
            System.out.println("Contents of " + myFileName);
            String line = br.readLine();

            while (line != null) {
                if (line.startsWith("This is line")) {
                    System.out.println("Valid Line: " + line);
                    // Ex3 Task2-2
                } else {
                    // Ex3 Task2-3
                    throw new BadLineException("Invalid line found", line);
                }

                line = br.readLine();
            }
        // Ex3 Task1-5
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + myFileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Caught an IO exception");
            e.printStackTrace();
        }
    }
}

