package OOPs;

public class Intern extends Employee{
private double stipend;
private double bonus;
private int leave=3;
public Intern(String empName, int empId, String empDept, double stipend, double bonus) {
	super(empName, empId, empDept);
	this.stipend=stipend;
	this.bonus=bonus;
}
@Override
double calSalary() {
	
	return stipend+bonus;
}
public double getStipend() {
	return stipend;
}
public void setStipend(double stipend) {
	this.stipend = stipend;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
@Override
boolean applyLeave(int days) {
	if(days<=leave) {
		leave-=days;
		return true;
	}
	return false;
}

}
