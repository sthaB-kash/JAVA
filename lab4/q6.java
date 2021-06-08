/*
 Make two threads,one display odd number after one second and
another thread display even number after half second between 1
and 20. Use both method of creating thread(Thread class and
Runnable interface)
 */
package lab4;

public class q6 {
   public static void main (String args[]){
       
       //by extending thread class 
//        System.out.println("By Extending Thread class");
        Even even = new Even();
        Odd odd = new Odd();
       
//        odd.start();
//        even.start();
        //by Runable interface
//        System.out.println("By Implementing runable interface");
        Even1 e = new Even1();
        Odd1 o = new Odd1();
        
        Thread odd1 = new Thread(o);
        Thread even1 = new Thread(e);
        odd1.start();
//        try{
//            Thread.sleep(1000);
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
        even1.start();
       
   }
}

class Even extends Thread {
    public void run(){
         try{
            for(int i=2; i<=20; i+=2) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Odd extends Thread {
    public void run(){
        try{
            for(int i=1; i<20; i+=2) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 

class Even1 implements Runnable {
    public void run(){
        
        try{
            for(int i=2; i<=20; i+=2) {
                Thread.sleep(500);
                System.out.println(i);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Odd1 implements Runnable {
    public void run(){
        
        try{
            for(int i=1; i<20; i+=2) {
                Thread.sleep(500);
                System.out.println(i);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
 