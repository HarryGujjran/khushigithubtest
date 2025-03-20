package OOPs;

public class PartTimeEmployee extends Employee{
	private int durationMonth;
	private double salary;

	public PartTimeEmployee(String empName, int empId, String empDept, double salary, int duration) {
		super(empName, empId, empDept);
		this.durationMonth=duration;
		this.salary=salary;
	}

	public int getDurationMonth() {
		return durationMonth;
	}

	public void setDurationMonth(int durationMonth) {
		this.durationMonth = durationMonth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	double calSalary() {
		return salary;
	}

	@Override
	boolean applyLeave(int days) {
		return false;
	}

}
