/*
Write a text “welcome to kcc” to a file myfile.txt using
fileOutputStream.
 */
package lab7;

import java.io.FileOutputStream;
import java.io.IOException;

public class q4 {
    public static void main(String args[]){    
           try{    
             FileOutputStream file=new FileOutputStream("greeting.txt");    
             String greeting ="Welcome to KCC";    
             byte b[]=greeting.getBytes();//converting string into byte array    
             file.write(b);    
             file.close();    
             System.out.println("success...");    
            }catch(IOException e){System.out.println(e);}    
      }    
}
