
public class Product {

    private double price;
    private int amount;
    private String name;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", " + this.price + ", " + this.amount);
    }
}
