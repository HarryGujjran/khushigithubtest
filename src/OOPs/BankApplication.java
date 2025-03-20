package OOPs;
import java.util.Scanner;
 
public class BankApplication {
	public static void main(String[] args) {
		BankAccount account1 =  new BankAccount("khushi", "HDFC1234", 5000.0);
		BankAccount account2 =  new BankAccount("Dumy", "AXIS1234", 1000.0);
		account1.transfer(1000, account2);
		
		System.out.println("----------------------");
		System.out.println("Transfer from saving account");
		
//		account1.setAccountHolderName("temp");
//		account1.setAccountNumber("IHYi7868");
//		account1.setBalance(-1000);
//		account1.deposit(1000.0, -70.0, 2000.0);
//		account1.displayDetails();
//		String name;
//		String accNo;
//		int balance;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Name: ");
//		name=sc.nextLine();
//		sc.nextLine();
//		System.out.println("Account No: ");
//		accNo=sc.nextLine();
//		sc.nextLine();
//		System.out.println("Balance: ");
//	    balance=sc.nextInt();
//		sc.nextLine();
		
//		
//		
//		BankAccount account2=new BankAccount(name,accNo,balance);
//		
//		account2.checkBalance();
//		
//		account2.deposit(5000);
//		account2.checkBalance();
//		
//		account2.withdraw(8000);
//		account2.withdraw(2000);
//		
//		sc.close();
//		SavingsBankAccount c1= new SavingsBankAccount("temp","SBIN999000",5000,0.9);
//		c1.calInterest();
//		
		SavingsBankAccount c1= new SavingsBankAccount("temp","SBIN999000",200,0.09);
//		c1.displayDetails();
//		c1.deposit(100);
		account1.transfer(500, c1);
//		c1.displayDetails();
		
		PremiumSavingsAccount pAcc = new PremiumSavingsAccount("Khushi", "12345", 9000, 0.1, 0.2);
		pAcc.displayDetails();
		pAcc.deposit(1000);
		pAcc.displayDetails();
		
		DematAccount dm1=new DematAccount("khushi", "12345", 1000, 10);
		dm1.buyStocks(5, 5);
		dm1.sellStocks(2, 20);
		dm1.displayDetails();
	}
 
}