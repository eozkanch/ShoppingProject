// Product class
public class Product {
    // Fields
    private int id;
    private String category;
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(int id, String category, String name, double price, int stock) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String apple, String fruit, double v, int price) {
    }

    // Methods
    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
