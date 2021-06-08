 
package hellojava;


public class HelloJava {

    public static void main(String[] args) {
                  
        Student std = new Student("KCC", "Putalisadak, KTM", "BCA|BIT|BE Comp", 300, "Bikash Shrestha", 1, "BCA");
        std.stdDetails();
        System.out.println("Department:" +std.dname + "\nCollege:" + std.cname + "\nAddress" + std.address);
    }
    
}
