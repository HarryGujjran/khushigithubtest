package OOPs;

public class FullTimeEmployeeInterface implements EmployeeInterface{

	private String empName;
	private int empId;
	private String empDept;
	private double basicSalary;
	private double bonus;
	
	public FullTimeEmployeeInterface(String empName, int empId, String empDept, double basicSalary, double bonus) {
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}

	@Override
	public void displayEmpDetails() {
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Id: "+empId);
		System.out.println("Emp Department: "+empDept);
		System.out.println("Salary/Stipend: "+ calSalary());
		
	}

	@Override
	public double calSalary() {
		return basicSalary+bonus;
	}

}
