package OOPs;

public class EmployeeMgmtApp {
	
	public static void main(String[] args) {
		FullTimeEmployee emp1=new FullTimeEmployee("Khushi",123,"IT", 50000.00, 30000.0, 20);
		System.out.println("Monthly Salary is: "+emp1.calSalary());
		emp1.displayEmpDetails();
		System.out.println(emp1.applyLeave(20));
		
		Intern emp2=new Intern("Jay", 456, "SDE", 55000, 1000);
		System.out.println("Monthly Salary is: "+emp2.calSalary());
		emp2.displayEmpDetails();
		System.out.println(emp2.applyLeave(10));
		
		PartTimeEmployee emp3=new PartTimeEmployee("abc", 777, "support", 1000, 3);
		System.out.println("Monthly Salary is: "+emp3.calSalary());
		emp3.displayEmpDetails();
		System.out.println(emp3.applyLeave(6));
		
		System.out.println("-------------------------------\n Interface implementation");
		
		FullTimeEmployeeInterface emp4=new FullTimeEmployeeInterface("KALRA",123,"IT", 55000, 4000);
		emp4.displayEmpDetails();
		emp4.OrganisationPolicy();
		EmployeeInterface.companyTagline();
		
System.out.println("-------------------------------\n Interface implementation");
		
		InternInterface emp5=new InternInterface("gupta",123,"technical", 55000, 3);
		emp5.displayEmpDetails();
		
System.out.println("-------------------------------\n Interface implementation");
		
		PartTimeInterface emp6=new PartTimeInterface("pateriya",123,"analyst", 52000, 3);
		emp6.displayEmpDetails();
		emp6.OrganisationPolicy();
	}

}
