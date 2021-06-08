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
import java.util. *;
public class q2 {
    public static void main (String []args) {
        LinkedList <Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(3);
            list.add(4);
            list.add(5);
        LinkedList newList = new LinkedList();
//        Iterator itr = list.iterator();
//        while(itr.hasNext()) {
//            if(!newList.contains(itr.next())){
//                newList.add(itr.next());
//            }
//        }
//        System.out.println(newList);
        for( Integer el : list) {
            if(!newList.contains(el))
                newList.add(el);
        }
        System.out.println(newList);
    }
}
