import java.util.List;

// Order class
public class Order {
    // Fields
    private int id;
    private List<Product> products;
    private Bill bill;

    // Constructor
    public Order(int id, List<Product> products) {
        this.id = id;
        this.products = products;
        this.bill = new Bill(this);
    }

    public Order() {

    }

    // Methods
    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Bill getBill() {
        return bill;
    }

    public void addProduct(Product apple) {
    }
}

