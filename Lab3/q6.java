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

class q6 {
    public static void main (String args[]) {
        GenericClassExample <Integer> num = new GenericClassExample<Integer>(14);
        System.out.println(num.getData());
        GenericClassExample <String> name = new GenericClassExample<String>("Bikash Shrestha");
        System.out.println(name.getData());
        
    }
}
 class GenericClassExample <T>{
     T val;
     GenericClassExample(T arg){
         val= arg;
     }
     public T getData() {
         return val;
     }
}
