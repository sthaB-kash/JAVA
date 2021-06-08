/*
 Create two classes Addition and Info where Addition class contains, sum(int
b,int b),sum(int d,int e,int f) which used to add the values passed from Info
class and also display the result from Info class.
 */
package Lab2;


public class q3 {
    public static void main(String [] args){
        Info demo = new Info();
        demo.sum(5,6);
        System.out.println(demo.displaySum());
        demo.sum(1,2,3);
        System.out.println(demo.displaySum());
    }
    
}

class Addition{
    public int sumVal;
    
    public void sum(int a, int b){
        sumVal =  a + b;
    }
    public void sum(int a, int b ,int c) {
        sumVal =  a+b+c;
    }
}

class Info extends Addition {
    public int displaySum(){
        return sumVal;
    }
}