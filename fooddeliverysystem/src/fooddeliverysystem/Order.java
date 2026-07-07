package fooddeliverysystem;

import java.util.Map;

public class Order {
	private int orderid;
	private Customer customer;
	private Map<fooditem,Integer> items;
	private String status;
	private Deliveryperson deliveryperson;
	private String deliveryaddress;
	public Order(int orderid, Customer customer, Map<fooditem, Integer> items, String status,
			Deliveryperson deliveryperson, String deliveryaddress) {
		super();
		this.orderid = orderid;
		this.customer = customer;
		this.items = items;
		this.status = status;
		this.deliveryperson = deliveryperson;
		this.deliveryaddress = deliveryaddress;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<fooditem, Integer> getItems() {
		return items;
	}
	public void setItems(Map<fooditem, Integer> items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Deliveryperson getDeliveryperson() {
		return deliveryperson;
	}
	public void setDeliveryperson(Deliveryperson deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	public String getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	public void addItem(fooditem b, int quantity) {
	    if (items.containsKey(b)) {
	        items.put(b, items.get(b) + quantity);
	    } else {
	        items.put(b, quantity);
	    }
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customer=" + customer + ", items=" + items + ", status=" + status
				+ ", deliveryperson=" + deliveryperson + ", deliveryaddress=" + deliveryaddress + "]";
	}
	
		
	}


