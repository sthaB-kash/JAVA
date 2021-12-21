/*
Create a class Student which has private properties such as
id,name,program,semester and public methods such as getter methods(to
get values) and setter methods(to set values) and create another class Info
from where methods are accessed to set and get values.
 */
package Lab2;

 

public class q4 {
    public static void main(String []args) {
        Info_ std = new Info_();
        std.Id(1);
        std.Name("Bikash Shrestha");
        std.Program("Bachelor of Computer Application");
        std.Semester(7);
        System.out.println("Student Details::\nID: " + std.Id() + "\nName: " + std.Name() + "\nProgram: "+ std.Program() + "\nSemester: "+ std.Semester());
    }
}

class Student {
    int id,semester;
    String   name,  program;
    
    public void Id(int id){
        this.id = id;
    }
    public void  Name(String name){
        this.name = name;
    }
    public void Program(String program){
        this.program = program;
    }
    public void Semester(int sem){
        semester = sem;
    }
    public int  Id() {
        return id;
    }
    public int Semester(){
        return semester;
    }
    public String Program(){
        return program;
    }
    public String Name(){
        return name;
    }
}

class Info_ extends Student {
    //empty class only acces the properties and methods of parent (Student)
    void whyInfo() {
        System.out.print("to access the getters and setters of Student");
    }
}