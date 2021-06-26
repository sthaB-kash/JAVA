/*
Write a program to read five integer value (1 2 3 4 5) from user in
one line separated with space and display each integer in next line
as 1
2
3
4
5
Note: Use BufferedReader to read program
 */
package lab7;

import java.io.*;
public class q3 {
    public static void main(String args[]) throws IOException{
        System.out.println("enter 5 integer numbers");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumbers = reader.readLine();
        String numbers [] = inputNumbers.split(" ");
        System.out.println("the entered numbers are");
        for(int i = 0; i<numbers.length; i++ ){
            System.out.println(numbers[i]);
        }
      
    }
    
}
