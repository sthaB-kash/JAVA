/*
Write a program that throws Exception from method and handled
by the calling function.
 */
package lab4;

public class q4 {
    static void divide(int a, int b){
        try{
            System.out.print(a + "divide by " + b + "= " + a/b);
            throw new ArithmeticException("divide by 0");
        }finally{
            System.out.println("finally block");
        }
    }
    public static void main (String args[]) {
        try{
            divide(8, 0);
        }catch(Exception e){
            System.out.println("Exception ----->" + e);
        }
    }
}


 
    
 