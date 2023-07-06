package abstractClassExample;

public abstract class ProductForSale {
    protected String type, description;
    protected double price;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(int qty){
        return qty * price;
    }

    public void printPriceLineItem(int qty) {
        // print an itemized line item for an order with qty and line item price
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
    }

    public abstract void showProductDetails(); // display type description and price.

} 