/*
Take input (id, studentName,address,phone) from user and
display the result.
 */
package lab7;

import java.util.Scanner;
public class q2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID>>>");
        int id = input.nextInt();
        System.out.println("Enter your name>>>");
        String name = input.nextLine();
        System.out.println("Enter your Address>>>");
        String address = input.nextLine();
        System.out.println("Enter your phone number>>>");
        String phone = input.next();
        
        System.out.println("User Details::");
        System.out.println("ID: "+ id + "\nName: " + name + "\nAddress: " + address + "\nPhone: "+ phone); 
        input.close();
    }
    
}
