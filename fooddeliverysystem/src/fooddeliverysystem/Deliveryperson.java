package fooddeliverysystem;

public class Deliveryperson {
	private int deliverypersonid;
	private String name;
	private long contactno;
	public Deliveryperson(int deliverypersonid, String name, long contactno) {
		super();
		this.deliverypersonid = deliverypersonid;
		this.name = name;
		this.contactno = contactno;
	}
	public int getDeliverypersonid() {
		return deliverypersonid;
	}
	public String getName() {
		return name;
	}
	public long getContactno() {
		return contactno;
	}
	@Override
	public String toString() {
		return "Deliveryperson [deliverypersonid=" + deliverypersonid + ", name=" + name + ", contactno=" + contactno
				+ "]";
	}
	

}
