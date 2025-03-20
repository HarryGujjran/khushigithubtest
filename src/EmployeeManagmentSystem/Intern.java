package EmployeeManagmentSystem;

public class Intern extends Employee{

	public double stipend=55000;
	public Intern(String empName, int empId, String department, int leaveBalance) {
		super(empName, empId, department, leaveBalance);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return empName;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	double calulateSalary() {
		// TODO Auto-generated method stub
		return stipend;
	}

	@Override
	String getEmployementType() {
		// TODO Auto-generated method stub
		return "Intern";
	}

	@Override
	void provideBenefits() {
		System.out.println("Meal Reimbursement");
		
	}

}
