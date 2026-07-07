package employee;

public class Developer extends Employee {
	private String plang;
	private int time;
	public Developer(int id,String name,int salary,String plang,int time){
		super(id,name,salary);
		this.plang=plang;
		this.time=time;
		
	}
	public String getPlang() {
		return plang;
	}
	public void setPlang(String plang) {
		this.plang = plang;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
	

}
