/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author dell
 */
import java.util.*;
public class q1 {
    public static void main (String args[]) {
        ArrayList <String>nameList = new ArrayList<>();
        nameList.add("ram");
        nameList.add("hari");
        nameList.add("ram");
        nameList.add("shyam");
        Iterator itr = nameList.iterator();
        ArrayList uniqueNames = new ArrayList ();
        while(itr.hasNext()){
            if(!uniqueNames.contains(itr.next()));
                uniqueNames.add(itr.next());
        }
        System.out.println("Duplicate values removed");
        Iterator unique = uniqueNames.iterator();
        while (unique.hasNext()) {
            System.out.println(unique.next());
        }
    }
}
