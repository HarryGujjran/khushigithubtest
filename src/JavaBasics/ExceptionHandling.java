package JavaBasics;
import java.util.Scanner;

public class ExceptionHandling {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int[] arr= {10,20,30};
			try {
				System.out.println("Result is: "+a/b);
				System.out.println(arr[4]);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception caught : "+e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught : "+e.getMessage());
			}
			catch(Exception e) {
				System.out.println("Exception caught : "+e.getMessage());
			}
			finally {
				System.out.println("--------");
				sc.close();
			}
	}


}
