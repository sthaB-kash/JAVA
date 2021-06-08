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
public class Student extends Department {
    String name;
    int id;
    String program;
    Student(String clz, String addr, String dept, int n, String sname, int sid, String p){
        super(clz, addr, dept, n);
        name = sname;
        id = sid;
        program = p;
    }
    public void stdDetails(){
        System.out.println("Student Details:\nID: " + id + "\nName:" + name + "\nProgram: " + program);
    }
}
