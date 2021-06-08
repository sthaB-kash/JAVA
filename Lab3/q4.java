/*
 Write a program for generic method that accept any type of data such as
Integer,String,Character,Double.
 */
package Lab3;

/**
 *
 * @author dell
 */
import java.util.*;
public class q4 {
    public static void main(String args[]){
        GenericMethod gm = new GenericMethod();
    Integer [] num = {2,5,6};
    gm.print(num);
    String [] name = {"bikash", "shrestha"};
    gm.print(name);
    
    }
}
 
class GenericMethod <T>{
    public static <T> void print(T[] arg){
        for(T val: arg){
            System.out.println(val);
        }
    }
}