/*
Write a program that demonstrate the concept of finally.
 */
package lab4;

public class q3 {
    public static void main (String args[]) {
        try{
            System.out.println("this is test of finally ");
            throw new RuntimeException("test");
        }catch(RuntimeException e){
            System.out.println("Exception caught:::" + e);
        }finally{
            System.out.println("FINALLY BLOCK---> this block always executes");
        }
        System.out.println("out of try catch and finally block");
    }
}
