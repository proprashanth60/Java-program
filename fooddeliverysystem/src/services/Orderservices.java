package services;
import java.util.ArrayList;
import java.util.List;

import fooddeliverysystem.Order;
import fooddeliverysystem.Deliveryperson;

public class Orderservices{

    private List<Order> orders = new ArrayList<>();
    private List<Deliveryperson> deliveryPersons = new ArrayList<>();

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addDeliveryPerson(Deliveryperson deliveryPerson) {
        deliveryPersons.add(deliveryPerson);
    }

    public List<Deliveryperson> getDeliveryPersons() {
        return deliveryPersons;
    }

    public void assignDeliveryPersonToOrder(int orderId, int deliveryPersonId) {
        // assign order to given delivery person
    }
}

