package utilities;
import employee.Employee;
import employee.Manager;
import employee.Developer;

public class EmployeeUtilities {
	
	   

		/**
	     * Displays basic employee details using public getter methods
	     * @param emp Employee object
	     */
	    public static void printEmployeeDetails(Employee emp) {
	        System.out.println("Name: " + emp.getName());
	        System.out.println("ID: " + emp.getId());
	        System.out.println("Salary: " + emp.getSalary());
	    }

	    /**
	     * Displays manager-specific details
	     * @param manager Manager object
	     */
	    public static void printManagerDetails(Manager manager) {
	        printEmployeeDetails(manager); // reuse method
	        System.out.println("Department: " + manager.getDepartment());
	        System.out.println("Team Size: " + manager.getTeamsize());
	    }

	    /**
	     * Displays developer-specific details
	     * @param dev Developer object
	     */
	    public static void printDeveloperDetails(Developer dev) {
	        printEmployeeDetails(dev);
	        System.out.println("Language: " + dev.getPlang());
	        System.out.println("Level: " + dev.getTime());
	    }
	}


