import java.util.ArrayList;
import java.util.List;

// Customer class
public class Customer {
    // Fields
    private int id;
    private String name;
    private int age;
    private List<Order> orders;

    // Constructor
    public Customer(String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }

    // Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}

