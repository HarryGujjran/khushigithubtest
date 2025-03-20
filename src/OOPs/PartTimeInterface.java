package OOPs;

public class PartTimeInterface implements EmployeeInterface{
	private String empName;
	private int empId;
	private String empDept;
	private double fixedamount;
	private int tasks;

	public PartTimeInterface(String empName, int empId, String empDept, double fixedamount, int tasks) {
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
		this.fixedamount = fixedamount;
		this.tasks = tasks;
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
	return tasks*fixedamount;
	}
	
	@Override
	public void OrganisationPolicy() {
		System.out.println("Part time policy");
	}

}
