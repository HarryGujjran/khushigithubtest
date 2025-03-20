package JavaBasics;
import java.util.Scanner;

public class Arraypractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		int [][] arr= new int[n][3];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks of all 3 subjects for student "+(i+1));
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//calculate percentage
		for(int i=0;i<arr.length;i++)
		{
			double sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
			sum+=arr[i][j];
			
			}
			System.out.println("Percentage of student "+(i+1)+":"+(sum/3));
		}
		
		sc.close();
	}

}
