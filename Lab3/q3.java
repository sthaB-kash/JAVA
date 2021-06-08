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
public class q3 {
    public static void main(String args[]) {
        HashMap<Integer, Integer> keyVal = new HashMap<>();
        ArrayList list = new ArrayList();
        Integer num[] = {1,3,5,6,5,3,7};
        for(Integer key: num) {
            if(!keyVal.containsKey(key)){
                 
                keyVal.put(key, key+ 1);
            }
        }
        for (Integer el: keyVal.keySet()){
            System.out.println("key"+el+"value::"+ keyVal.get(el));
        }
    }
}
