package employee;

public class Test {
	public static void main(String[] args) {
		Manager e=new Manager(123,"mahesh",23455,"cse",6);
		Developer f=new Developer(143,"ng",4567,"java",4);
		System.out.println(e.getName());
		System.out.println(e.getDepartment());
	
		System.out.println(e.getId());
		System.out.println(e.getSalary());
		System.out.println(f.getPlang());
	}

}
