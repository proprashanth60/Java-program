package Entities;

public class Account {
	private int accountid;
	private int customerid;
	private String type;
	private double balance;
	public Account(int accountid, int customerid, String type, double balance) {
		super();
		this.accountid = accountid;
		this.customerid = customerid;
		this.type = type;
		this.balance = balance;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", customerid=" + customerid + ", type=" + type + ", balance="
				+ balance + "]";
	}
	

}
