package Entities;

public class Transaction {
	private int transactionid;
	private int accountid;
	private String type;
	private double amount;
	public Transaction(int transactionid, int accountid, String type, double amount) {
		super();
		this.transactionid = transactionid;
		this.accountid = accountid;
		this.type = type;
		this.amount = amount;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", accountid=" + accountid + ", type=" + type
				+ ", amount=" + amount + "]";
	}
	
	

}
