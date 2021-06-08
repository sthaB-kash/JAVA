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
public class q5 {
   public static void main(String[] args)
    {
        // Set demonstration using HashSet
        Set<String> nameSet = new HashSet<String>();
        String [] nameList = {"Bikash", "Samita", "Bikash", "Sangita", "Sanjiv"};
        for (String name : nameList){
            nameSet.add(name);
        } 
        System.out.println(nameSet);
    }  
}
 
 