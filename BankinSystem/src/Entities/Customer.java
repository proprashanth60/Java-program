package Entities;

public class Customer {
	private int customerid;
	private String name;
	private String address;
	private String contact;
	public Customer(int customerid,String name,String address,String contact) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}

	
	

}
