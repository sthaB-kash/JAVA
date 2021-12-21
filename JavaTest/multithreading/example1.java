class Thread1 extends Thread {
    public void run(){
        try{
             for(int i=1; i<=5; i++) {
                System.out.println("hello");
                // sleep(1000);
            }  
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try{
            for(int i=1; i<=5; i++) {
                System.out.println("hi");
                // sleep(2000);
            }
        }catch(Exception e){System.out.println(e);}
    }
}


//main class
class ThreadDemo {
    public static void main(String [] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();

        try{
            Thread.sleep(5000);
        }catch(Exception e){System.out.println(e);}

        t2.start();
    }
}