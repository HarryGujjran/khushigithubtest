package EmployeeManagmentSystem;
import java.util.Scanner;



public class EMSApplication {
	
	private static Employee[] emps;
	private static int totalemp=0;
	private static int maxemp=5;
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		emps=new Employee[5];
		while(true) {
			System.out.println("Employee Managment System");
			System.out.println("Press 1: To create employee\n Press 2: Display all employees\n Press 3: Payroll information\n Press 4:Exit ");
			int n= scanner.nextInt();
			switch(n) {
			case 1:
				createEmployee(scanner);
				break;
			case 2:
				displayInformation();
				break;
			case 3:
				payrollInfo();
				break;
			case 4:
				return;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
	public static void payrollInfo() {
		System.out.println("Payroll Information");
		for(int i=0;i<totalemp;i++)
		{
			PayrollManager.generatePayroll(emps[i]);
			System.out.println("---------------------");
		}
	}
	
	//display
	
	public static void displayInformation() {
		System.out.println("Employee Information");
		for(int i=0;i<totalemp;i++) {
			emps[i].displayInfo();
			System.out.println("Salary: "+emps[i].calulateSalary());
			System.out.println("---------------------");
		}
	}
	//create

	public static void createEmployee(Scanner scanner) {
		if (totalemp>=maxemp) {
			System.out.println("Cannot create more Employees.");
			return;
		}
		System.out.println("Enter name, ID, department, Leave balance.");
		String Name=scanner.next();
		int ID=scanner.nextInt();
		String Dept=scanner.next();
		int leave=scanner.nextInt();
		System.out.println("Select option:\n 1: FTE\n 2: Part Time Employee\n 3: Intern\n 4: Manager");
		int accType=scanner.nextInt();
		switch(accType) {
		case 1:
			System.out.println("Enter the salary, fixed bonus");
			double salary=scanner.nextDouble();
			double bonus=scanner.nextDouble();
			emps[totalemp]=new FullTimeEmployee(Name, ID, Dept, salary,leave,bonus);
			break;
		case 2:
			System.out.println("Enter number of salary, hours");
			salary=scanner.nextDouble();
			double hours= scanner.nextDouble();
			emps[totalemp]=new PartTimeEmployee(Name, ID, Dept, salary,leave,hours);
			break;
		case 3:
			emps[totalemp]=new Intern(Name, ID, Dept,leave);
			break;
		case 4:
			System.out.println("Enter the salary, fixed bonus");
			salary=scanner.nextDouble();
			bonus=scanner.nextDouble();
			emps[totalemp]=new ManagerEmployee(Name, ID, Dept, salary,leave,bonus);
			break;
		default:
			System.out.println("Invalid option selected");	
		}
		System.out.println("Account created successfully");
		totalemp++;
	}
	
}
