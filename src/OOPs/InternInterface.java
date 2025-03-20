package OOPs;

public class InternInterface implements EmployeeInterface{
	private String empName;
	private int empId;
	private String empDept;
	private double stipend;
	private int months;

	@Override
	public void displayEmpDetails() {
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Id: "+empId);
		System.out.println("Emp Department: "+empDept);
		System.out.println("Salary/Stipend: "+ calSalary());
		
	}

	public InternInterface(String empName, int empId, String empDept, double stipend, int months) {
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.stipend = stipend;
		this.months = months;
	}

	@Override
	public double calSalary() {
		return months*stipend;
	}

}
