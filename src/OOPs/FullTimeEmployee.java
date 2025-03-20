package OOPs;

public class FullTimeEmployee extends Employee{
	private double basicSalary;
	private double bonus;
	private int leaveDays;

	public FullTimeEmployee(String empName, int empId, String empDept, double basicsal, double bonus, int leave) {
		super(empName, empId, empDept);
		this.basicSalary=basicsal;
		this.bonus=bonus;
		this.leaveDays=leave;
	}

	@Override
	double calSalary() {
		return basicSalary+bonus;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean applyLeave(int days) {
		if(days<=leaveDays) {
			leaveDays-=days;
			return true;
		}
		return false;
	}

}
