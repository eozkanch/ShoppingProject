import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create customers
        Customer cem = new Customer("Cem", 28);
        Customer ahmet = new Customer("Ahmet", 32);
        Customer mehmet = new Customer("Mehmet", 40);

        // Create products
        Product apple = new Product("Apple", "Fruit", 1.50, 10);
        Product banana = new Product("Banana", "Fruit", 2.00, 5);
        Product watermelon = new Product("Watermelon", "Fruit", 5.00, 3);
        Product laptop = new Product("Laptop", "Electronics", 1000.00, 2);
        Product tv = new Product("TV", "Electronics", 1500.00, 1);

        // Create orders and add products to orders
        Order order1 = new Order();
        order1.addProduct(apple);
        order1.addProduct(banana);

        Order order2 = new Order();
        order2.addProduct(watermelon);
        order2.addProduct(laptop);
        order2.addProduct(tv);

        // Add orders to customers
        cem.addOrder(order1);
        cem.addOrder(order2);

        // Create a list of all customers
        List<Customer> customers = new ArrayList<>();
        customers.add(cem);
        customers.add(ahmet);
        customers.add(mehmet);

        // Find the number of all customers in the system
        System.out.println("Number of customers in the system: " + customers.size());

        // Calculate the number of products purchased by customers whose name is Cem
        int numProductsByCem = 0;
        for (Customer customer : customers) {
            if (customer.getName().equals("Cem")) {
                for (Order order : customer.getOrders()) {
                    numProductsByCem += order.getProducts().size();
                }
            }
        }
        System.out.println("Number of products purchased by Cem: " + numProductsByCem);

        // Calculate the total shopping amount of customers whose name is Cem and who are younger than 30 and older than 25
        double totalAmountByCem = 0;
        for (Customer customer : customers) {
            if (customer.getName().equals("Cem") && customer.getAge() < 30 && customer.getAge() > 25) {
                for (Order order : customer.getOrders()) {
                    totalAmountByCem += order.getBill().getAmount();
                }
            }
        }
        System.out.println("Total shopping amount by Cem (age < 30 and age > 25): " + totalAmountByCem);

        // List all bills over 1500 TL in the system
        List<Bill> billsOver1500 = new ArrayList<>();
        for (Customer customer : customers) {
            for (Order order : customer.getOrders()) {
                if (order.getBill().getAmount() > 1500) {
                    billsOver1500.add(order.getBill());
                }
            }
        }
        System.out.println("Bills over 1500 TL: " + billsOver1500);}}