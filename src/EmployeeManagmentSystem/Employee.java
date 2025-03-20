package EmployeeManagmentSystem;

abstract class Employee implements Person{
	protected String empName;
	protected int empId;
	protected String department;
	protected double baseSalary;
	protected int leaveBalance;
	public Employee(String empName, int empId, String department, double baseSalary, int leaveBalance) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.baseSalary = baseSalary;
		this.leaveBalance = leaveBalance;
	}
	public Employee(String empName, int empId, String department, int leaveBalance) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
		this.leaveBalance = leaveBalance;
	}
	
	abstract double calulateSalary();
	abstract String getEmployementType();
	abstract void provideBenefits();
	
	public boolean requestLeaves(int days) {
		if(days<=leaveBalance) {
			leaveBalance-=days;
			System.out.println("Leave approved");
			return true;
		}
		System.out.println("Leave not granted.");
		return false;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("-------------");
		System.out.println("Emp name: "+empName+" Emp ID: "+empId+" Department: "+department);
		System.out.println("Employment Type: "+getEmployementType());
		System.out.println("Monthly salary: "+calulateSalary());
		System.out.println("Leave balance: "+leaveBalance);
		provideBenefits();
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

}
