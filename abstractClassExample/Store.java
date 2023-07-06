/*
 *
 * Create a Store class with main method.
 * The Store class should
 *  - manage a list of products for sle, including displaying the product details.
 *  - manage an order, which can just be a list of OrderItem objects,
 *  - have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.
 * 
 * Create a ProductForSale class that should have at lease there fields: 
 *  a type, price and a description, and should have methods to:
 *      - get a sales price, a concrete method, which takes a quantity, and returns the quantity times the price.
 *      - print a Priced Line Item, a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and line item price.
 *      - show details, an abstract method, which represents what might be displayed on a product page, product type, description, price and so on.
 * 
 * Create an OrderItem type, that has a minimum 2 fields, quantity and a Product for Sale.
 * 
 *  You should create two or three classes that extend the ProductForSale class, that will be products in your store.
 * 
 *  
 */

package abstractClassExample;
import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1200, "Impressionistic work by abc painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2300, "Bronze work by JKF, produced in 1950"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);
    }

    public static void listProducts() {
        for( var item : storeProducts) {
            System.out.println("_".repeat(30));
            item.showProductDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double total = 0;
        for(var item : order) {
            item.product().printPriceLineItem(item.qty());
            total += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Total: $%6.2f %n", total);
    }
}



 