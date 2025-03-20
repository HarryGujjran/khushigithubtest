package EmployeeManagmentSystem;

public class PayrollManager {
	
	public static void generatePayroll(Employee emp) {
		double salary=emp.calulateSalary();
		double bonus=(emp instanceof BonusProvider)?((BonusProvider) emp).calculateBonus(salary):0;
		salary+=bonus;
		double tax=(emp instanceof Taxable)?((Taxable) emp).calculateTax(salary):0;
		double netSalary=salary-tax;
		System.out.println("Payroll for: "+ emp.getEmpName());
		System.out.println("Monthly salary: "+ (salary-bonus));
		System.out.println("Bonus: "+bonus);
		System.out.println("Total salary: "+ salary);
		System.out.println("Tax deduction: "+ tax);
		System.out.println("net salary : "+ netSalary);
				
	}

}
