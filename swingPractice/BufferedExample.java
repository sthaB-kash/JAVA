/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPractice;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class BufferedExample {
    public static void main(String args[]) throws IOException{
        FileWriter writer = new FileWriter("greeting.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================================================");
        System.out.print("\nHy, what's your name:: ");
        String name = input.nextLine();
        buffer.write("Hello " + name + ", Welcome to KCC");
        buffer.close();
        System.out.println("Written to file successfully");
        
        
        FileReader fr = new FileReader("greeting.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.print("\nData Written to file::\n");
        int c;

        while((c=br.read())!=-1){
        System.out.print((char)c);

        }
        System.out.println("\n\n===========================================================================");
        br.close();

    }
}
