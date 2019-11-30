package org.singleInHeritance;

public class Institution  extends Employee {
	public void institutionName() {
	System.out.println("Institution Name - Greens Technonogys");

	}
	public void institutionBranch() {
		System.out.println("Institution Branch - Thuraipakam");
		
	  

	}
	public static void main(String[] args) {
		Institution i = new Institution();
		i.institutionName();
		i.institutionBranch();
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empPhone();
		e.empdob();
		e.empAddress();
	}
	
	

}
