package OOPs;

public interface EmployeeInterface {
	void displayEmpDetails();
	double calSalary();
	
	default void OrganisationPolicy() {
		System.out.println("All policy applicable");
	}
	
	static void companyTagline()
	{
		System.out.println("Welcome to genpact");
	}

}
