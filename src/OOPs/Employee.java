package OOPs;

abstract class Employee {
private String empName;
private int empId;
private String empDept;
public Employee(String empName, int empId, String empDept) {
	this.empName = empName;
	this.empId = empId;
	this.empDept = empDept;
}
//concrete method
public void displayEmpDetails() {
	System.out.println("Emp Name: "+empName);
	System.out.println("Emp Id: "+empId);
	System.out.println("Emp Department: "+empDept);
}
//abstract method
abstract double calSalary();

abstract boolean applyLeave(int days);
}
