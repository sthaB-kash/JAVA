/*
 Write a program to add elements such as (“ram”,”hari”,10,20) into a Vector
and use for each loop to display the values of the Vector.
 */
 
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
