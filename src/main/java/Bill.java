// Bill class
public class Bill {
    // Fields
    private int id;
    private double total;

    // Constructor
    public Bill(Order order) {
        this.id = order.getId();
        this.total = 0;
        for (Product product : order.getProducts()) {
            this.total += product.getPrice();
        }
    }

    // Methods
    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }
    public double getAmount() {

        return 0;
    }

}
