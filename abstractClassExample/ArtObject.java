package abstractClassExample;

public class ArtObject extends ProductForSale {
    public ArtObject(String type, int qty, String description) {
        super(type, qty, description);
    }

    public void showProductDetails() {
        System.out.println("This " + type + " is a beautiful reproductions");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}