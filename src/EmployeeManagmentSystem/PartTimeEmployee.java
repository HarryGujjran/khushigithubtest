package EmployeeManagmentSystem;

public class PartTimeEmployee extends Employee implements WorkHours{

	public double hours;
	public PartTimeEmployee(String empName, int empId, String department, double baseSalary, int leaveBalance, double hours) {
		super(empName, empId, department, baseSalary, leaveBalance);
		this.hours=hours;
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
	public int getWorkHours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double calulateSalary() {
		// TODO Auto-generated method stub
		double extra=0;
		if(hours>20) {
			extra=(hours-20)*100;
		}
		return baseSalary+extra;
	}

	@Override
	String getEmployementType() {
		// TODO Auto-generated method stub
		return "Part Time employee";
	}

	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("No benefits for part time employee");
		
	}

}
