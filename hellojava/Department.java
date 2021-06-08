/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author dell
 */
public class Department extends College {
    String dname ;
    int no_of_students;
    Department(String clz, String addr, String dept, int n){
        super(clz, addr);
        dname = dept;
        no_of_students = n;
    }
}
