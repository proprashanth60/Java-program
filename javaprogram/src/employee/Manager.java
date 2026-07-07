package employee;

public class Manager extends Employee {
	private String department;
	private int teamsize;
	 public Manager(int id,String name,int salary,String department,int teamsize){
		 super(id,name,salary);
		 this.department=department;
		 this.teamsize=teamsize;
	 }
	 public String getDepartment() {
		 return department;
	 }
	 public void setDepartment(String department) {
		 this.department = department;
	 }
	 public int getTeamsize() {
		 return teamsize;
	 }
	 public void setTeamsize(int teamsize) {
		 this.teamsize = teamsize;
	 }
		 
		 
		 
	 

}
