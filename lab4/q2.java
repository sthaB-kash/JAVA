/*
Write a program that demonstrate the concept of multiple catch
blocks.
 */
package lab4;

 
public class q2 {
    public static void main (String args[]){
        int num[] = new int[4];
        try{
            num[3]=  num[2]/args.length;
            System.out.println("3rd index value divided by arg length");
        }catch(ArithmeticException e){
            System.out.println("Divide by 0" + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds::"+ e);
        }catch(Exception e){
            System.out.println("some other exception ::"+ e);
        }
        
        System.out.println("Out of try catch block");
    }
}
