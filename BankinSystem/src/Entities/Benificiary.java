package Entities;

public class Benificiary {
	private int benificiaryid;
	private int customerid;
	private String name;
	private String accountnumber;
	private String bankdetails;
	public Benificiary(int benificiaryid, int customerid, String name, String accountnumber, String bankdetails) {
		super();
		this.benificiaryid = benificiaryid;
		this.customerid = customerid;
		this.name = name;
		this.accountnumber = accountnumber;
		this.bankdetails = bankdetails;
	}
	public int getBenificiaryid() {
		return benificiaryid;
	}
	public void setBenificiaryid(int benificiaryid) {
		this.benificiaryid = benificiaryid;
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
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}
	@Override
	public String toString() {
		return "Benificiary [benificiaryid=" + benificiaryid + ", customerid=" + customerid + ", name=" + name
				+ ", accountnumber=" + accountnumber + ", bankdetails=" + bankdetails + "]";
	}
	

}
