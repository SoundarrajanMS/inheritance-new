package org.singleInHeritance;

public class Employee {
public void empId() {
	System.out.println("Employee Id - 100");

} 
public void empName() {
    System.out.println("Employee Name - Soundarrajan.S");

}
public void empdob() {
	System.out.println("Employee Dob - 31.01.1993 ");

}
public void empPhone() {
    System.out.println("Employee Phone.No - 995105007");

}
public void empEmail() {
	System.out.println("Employee Email id - ms.soundar09@gmail.com");

}
public void empAddress() {
	System.out.println("Employee Address - Coimbatore");

}
public static void main(String[] args) {
	

Employee e = new Employee();
e.empId();
e.empName();
e.empPhone();
e.empAddress();
e.empdob();



}
}