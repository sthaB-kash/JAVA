/*
Create InsufficientBalance user-defined exception that handles
users thrown exception. create another class Withdraw having
id,name and balance as instance variable.One constructor to
initialize instance variables and another method to display
information.If the balance is less than 1000 then
InsufficientBalance exception will be thrown and handle it properly
otherwise display the information in the screen.itor.
 */
package lab4;

 
public class q5 {
    public static void main(String arg[]){
        int id = 3;
        String name = "Bikash Shrestha";
        double amt = 3434;
        try {
             if(amt<1000){
                 throw new InsufficientBalance("Balance must be more than 1000");
            }else{
                Withdraw myAccount = new Withdraw(id, name, amt);
                myAccount.display();  
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}


class Withdraw {
    int id;
    String name;
    double bal;
    Withdraw(int id, String name, double bal){
        this.id = id;
        this.name = name;
        this.bal = bal;
    }
    public void display(){
        System.out.println("Account details\n"+ "ID: " + id + "\nName: "+ name + "\nBalance: "+ bal);
    }
}

class InsufficientBalance extends Exception {
    InsufficientBalance(String msg){
        super(msg);
    }
}