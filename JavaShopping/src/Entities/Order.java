package Entities;
import java.util.List;

public class Order {

    private int orderId;  // Unique identifier
    private Customer customer;  // Many-to-One relationship
    private List<ProductQuantityPair> products; // Many-to-Many with Product
    private String status; // Pending, Completed

    // Constructor
    public Order(int orderId, Customer customer, List<ProductQuantityPair> products, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.status = status;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductQuantityPair> getProducts() {
        return products;
    }

    public void setProducts(List<ProductQuantityPair> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display method
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getUsername());
        System.out.println("Status: " + status);

        System.out.println("Products:");
        for (ProductQuantityPair p : products) {
            System.out.println("Product: " + p.getProduct().getName() +
                               ", Quantity: " + p.getQuantity());
        }
    }
}
