/*
Write a program to read from a file myfile.txt using
FileInputStream and display the text to the console.
 */
package lab7;
 import java.io.FileInputStream;  
public class q5 {
    public static void main(String args[])
    {    
        try
        {    
            FileInputStream file=new FileInputStream("greeting.txt");    
            int i=0;    
            while((i=file.read())!=-1)
            {    
                System.out.print((char)i);  
            }  
            file.close();    
        }
            catch(Exception e){System.out.println(e);
        }    
    }   
}
