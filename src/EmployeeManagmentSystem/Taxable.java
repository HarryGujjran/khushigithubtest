package EmployeeManagmentSystem;

public interface Taxable {
	//by default -->public static final
	double Tax_Rate=0.20;
	
	double calculateTax(double salary);
	

}
