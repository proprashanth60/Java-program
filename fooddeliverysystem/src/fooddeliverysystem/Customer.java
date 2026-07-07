package fooddeliverysystem;

public class Customer extends User {
	private Cart cart;

	public Customer(int userid,String username,long contactno) {
		super(userid,username,contactno);
		this.cart = cart;
	}
	public Cart getcart() {
		return cart;
	}
	

}
