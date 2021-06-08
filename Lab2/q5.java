/*
 Create three classes Product, Food and Cloth where Product is Parent class
and Food and Cloth are child classes. put common properties and methods
in parent class and specific properties and methods in Child class. Now child
class can inherit the common properties and methods of parent class and
also invoke methods of its own class. 
 */
package Lab2;

 
public class q5 {
    public static void main(String []args){
        Food myFood = new Food("Piza", 220, "22-05-2021",  "24-05-2021" );
        myFood.Details();
        Cloth myCloth = new Cloth("Shirt" , 1300, 37);
        myCloth.Details();
    }
}

class Product {
    String name;
    float price;
    
    Product (String name, float price ) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return  name;
    }
    public float getPrice() {
        return price;
    }
}

class Food extends Product {
    String mfd,exp;
    
    Food(String name, float price, String mfd, String exp) {
        super(name, price);
        this.mfd = mfd;
        this.exp = exp;
    }
    public void Details(){
        System.out.println("Food Details:\n");
        System.out.println("Name: " + getName() + "\nPrice: " + getPrice());
        System.out.println("MFD: " + mfd + "\nEXP: "+exp);
    }
}

class Cloth extends Product {
    int size;
    
    Cloth(String name, float price,  int size) {
        super(name, price);
        this.size = size;
    } 
    public void Details(){
        System.out.println("Cloth Details:\n");
        System.out.println("Name: " + getName() + "\nPrice: " + getPrice());
        System.out.println("Size: " + size);
    }
}