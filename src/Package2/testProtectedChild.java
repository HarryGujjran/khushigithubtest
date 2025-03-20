package Package2;
import Package1.testSubclass;


public class testProtectedChild extends testSubclass{
	@Override
	public void displayVar()
	{
		 System.out.println("Diff pkg Protected variable: "+ num);
	}

}
