/*
 Write a program to read from a file and then again write same
text to the another file using both fileInputStream and
FileOutputStream. 
  
 */
package lab7;

import java.io.*;
public class q6 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("greeting.txt");
            File outputFile = new File("copy.txt");

            FileInputStream fin= new FileInputStream(inputFile);
            FileOutputStream fout = new FileOutputStream(outputFile);
            int c;

            while ((c = fin.read()) != -1) {
               fout.write(c);
            }

            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }
}
