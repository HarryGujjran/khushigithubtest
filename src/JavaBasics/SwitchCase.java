package JavaBasics;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rating & salary");
		int r =sc.nextInt();//rating
		double salary= sc.nextDouble();
		double hike=0;
		switch (r) {
		case 1:
			hike=0;
			break;
		case 2:
			hike=0.05;
			break;
		case 3:
			hike=0.08;
			break;
		case 4:
			hike=0.10;
			break;
		case 5:
			hike=0.12;
			break;
		default:
			System.out.println("Invalid values");
		}
		System.out.println(salary+(hike*salary));
		sc.close();
	}
}
