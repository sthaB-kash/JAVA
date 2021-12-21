 /*
        Write a program to create two threads one is to display “Good morning” in 1 second 
        and other is to display “Good Afternoon” in 2 seconds.
 */

class Threading {
  public static void main (String args[]){
        Morning morning = new Morning();
        Afternoon afternoon = new Afternoon();
        Thread t1 = new Thread(morning);
        Thread t2 = new Thread(afternoon);
        t1.start();
        t2.start();
       
   }  
}

class Morning implements Runnable {
    public void run(){
         try{
            Thread.sleep(1000);
            System.out.println("Good monring!");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class Afternoon implements Runnable {
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
 
 
 