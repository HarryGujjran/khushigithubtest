package JavaBasics;
import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		if(n==0)
		{
			System.out.println("1");
			System.exit(0);
		}
		double ans=1;
		//while loop
		int i=1;
		while(i<=n)
		{
			ans*=i;
			i++;
		}
		System.out.println("Factorial: "+ans);
		//first n natural numbers:
		i=0;
		int sum=0;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum of n natural numbers is: "+sum);
		//first  even natural numbers:
				i=0;
				sum=0;
				while(i<=n*2)
				{
					sum+=i;
					i+=2;
				}
				System.out.println("sum of even numbers is: "+sum);
		//for loop
//		for(int i=1;i<=n;i++)
//		{
//			ans=ans*i;
//		}
		
		sc.close();
	}
	//sum of natural numbers
//		int sum=0;
//		for(int i=1;i<=20;i++)
////		{
////		sum+=i;	
////		}
//		{
//			if(i%2==0)
//			{
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//	}

}
