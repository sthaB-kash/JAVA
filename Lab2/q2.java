
 
package Lab2;

import java.util.*; 
public class q2 {
    public static void main(String args[]) {
        Vector testVector = new Vector();
        testVector.add("ram");
        testVector.add("hari");
        testVector.add(10);
        testVector.add(20);
        
        for(Object val: testVector){
            System.out.println(val);
        }
    }
}
