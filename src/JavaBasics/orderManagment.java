package JavaBasics;
import java.util.Scanner;

public class orderManagment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the store"+'\n'+"-------------------"+
				'\n'+"Enter the number of unique items you want to purchase:");
		int n=sc.nextInt();
		double Tp=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the item");
			String name=sc.nextLine();
			System.out.println("Enter price");
			int p=sc.nextInt();
			System.out.println("Enter quantity");
			int q=sc.nextInt();	
			Tp+=p*q;
		}
		//total cost >=5000 && <=10000, 10%
//		>10000, 20%
		double dis=0;
		if(Tp>=5000&&Tp<=10000)
		{
			dis=0.10;
		}
		else if(Tp>=20000)
		{
			dis=0.20;
		}
		else {
			dis=0;
		}
		int shipping=0;
		if(Tp-(dis*Tp))
		System.out.println("Bill");
		System.out.println("Total price: "+ Tp);
		System.out.println("Discount: -"+(dis*Tp));
		System.out.println("Final price:");
	}

}
