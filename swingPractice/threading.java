/*
 Write a program to create two threads one is to display “Good morning” in 1 second 
and other is to display “Good Afternoon” in 2 seconds.
 */
package swingPractice;

public class threading {
  public static void main (String args[]){
        Morning morning = new Morning();
        Afternoon afternoon = new Afternoon();
        morning.start();
        afternoon.start();
       
   }  
}

class Morning extends Thread {
    public void run(){
         try{
            Thread.sleep(1000);
            System.out.println("Good monring!");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Afternoon extends Thread {
    public void run(){
        try{
            Thread.sleep(2000);
            System.out.println("Good Afternoon");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 
 
 