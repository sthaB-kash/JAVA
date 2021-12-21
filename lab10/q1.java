/*
/*
Write a program to create two threads one is to display sum of every odd
number in 2 seconds and other is to sum of every even number in 1.5
seconds using Runnable interface from 200 to 500.
 */
package lab10;

public class q1 {
   public static void main (String args[]){
 
        EvenSum e = new EvenSum();
        OddSum o = new OddSum();
        
        Thread odd = new Thread(o);
        Thread even = new Thread(e);
        odd.start();
//        try{
//            Thread.sleep(1000);
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
        even.start();
       
   }
}

 

class EvenSum implements Runnable {
    public void run(){
        int evenSum=0;
         try{
            for(int i=200; i<=500; i+=2) {
                evenSum+=i;
                Thread.sleep(1500);
                System.out.println(evenSum);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class OddSum implements Runnable {
    public void run(){
        int oddSum = 0;
        try{
            for(int i=201; i<500; i+=2) {
                oddSum += i;
                Thread.sleep(2000);
                System.out.println(oddSum);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 
