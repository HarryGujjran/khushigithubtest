package OOPs;
import java.util.Scanner;

public class BankApplicationNew {
	private static BankAccount[] accounts;//array of bank accounts
	//whenever a new account is created update the total accounts
	private static int totalAccounts=0;
	private static int maxAccounts=5;
	
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	accounts= new BankAccount[5];
	while (true) {
		System.out.println("Bank Application Menu");
		System.out.println("Press 1: To create an account\n Press 2: Display all accounts\n Press 3: Deposit Money\n Press 4: Withdraw Money\n Press 5: Transfer Money\n Press 6: Buy stocks\n Press 7: Sell Stocks\nPress 8:Exit ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			createAccount(scanner);
			break;
		case 2:
			displayAllAccounts();
			break;
		case 3:
			depositMoney(scanner);
			break;
		case 4:
			withdrawMoney(scanner);
			break;
		case 5:
			transferMoney(scanner);
			break;
		case 6:
			buyStocks(scanner);
			break;
		case 7:
			sellStocks(scanner);
			break;
		case 8:
			System.out.println("Thank you for exiting.");
			return;
		default: 
			System.out.println("Invalid Choice. Enter from 1-6.");
		}
		}
	}
	
	public static void createAccount(Scanner scanner) {
		if (totalAccounts>=maxAccounts) {
			System.out.println("Cannot create more accounts.");
			return;
		}
		System.out.println("Enter Account name, Account number, Balance.");
		String accountName=scanner.next();
		String accountNumber=scanner.next();
		double accountBalance=scanner.nextDouble();
		System.out.println("Select option:\n 1: Bank Account\n 2: Savings Bank Account\n 3: Premium Saving Account\n 4: Demat Account");
		int accType=scanner.nextInt();
		switch(accType) {
		case 1:
			accounts[totalAccounts]=new BankAccount(accountName, accountNumber, accountBalance);
			break;
		case 2:
			System.out.println("Enter interest rate");
			double interestRate= scanner.nextDouble();
			accounts[totalAccounts]=new SavingsBankAccount(accountName, accountNumber, accountBalance, interestRate);
			break;
		case 3:
			System.out.println("Enter interest rate, Premium interest rate");
			interestRate= scanner.nextDouble();
			double premiumInt=scanner.nextDouble();
			accounts[totalAccounts]= new PremiumSavingsAccount(accountName, accountNumber, accountBalance, interestRate, premiumInt);
			break;
		case 4:
			System.out.println("Enter stocks");
			int stocks= scanner.nextInt();
			accounts[totalAccounts]=new DematAccount(accountName, accountNumber, accountBalance, stocks);
			break;
		default:
			System.out.println("Invalid option selected");	
		}
		System.out.println("Account created successfully");
		totalAccounts++;
	}
	
	//case 2
	public static void displayAllAccounts() {
		if(totalAccounts==0) {
			System.out.println("No account to display.");
			return;
		}
		System.out.println("Bank Account Details--------");
		for(int i=0;i<totalAccounts;i++) {
			accounts[i].displayDetails();
			System.out.println("----------------------");
		}
	}
	// case 3
	public static void depositMoney(Scanner scanner) {
		//amount , accountNumber
		System.out.println("Enter account Number : ");
		String accNum=scanner.next();
		System.out.print("Enter the amount to be deposited");
		double amount= scanner.nextDouble();
		
		BankAccount account= findAccount(accNum);// if no account exits then it is going to return null
		if(account!=null) {
			account.deposit(amount);
		}
		else {
			System.out.println("Account not found");
		}
	}
	
	// case 4
	public static void withdrawMoney(Scanner scanner) {
		System.out.println("Enter account Number : ");
		String accNum=scanner.next();
		System.out.print("Enter the amount to be withdrawen");
		double amount= scanner.nextDouble();
		BankAccount account= findAccount(accNum);// if no account exits then it is going to return null
		if(account!=null) {
			account.withdraw(amount);
		}
		else {
			System.out.println("Account not found");
		}
		
	}
	public static void buyStocks(Scanner scanner) {
		System.out.print("Enter demat account number: ");
		String accNum=scanner.next();
		System.out.print("Enter no. of stocks u want to buy ");
		int stockNum = scanner.nextInt();
		System.out.print("Enter price per stock ");
		double price = scanner.nextDouble();
		BankAccount account = findAccount(accNum);
		if(account!=null) {
			((DematAccount) account).buyStocks(stockNum,price);
		}
		else
			System.out.println("Account not found");
	}
	public static void sellStocks(Scanner scanner) {
		System.out.print("Enter demat account number: ");
		String accNum=scanner.next();
		System.out.print("Enter no. of stocks u want to sell ");
		int stockNum = scanner.nextInt();
		System.out.print("Enter price per stock ");
		double price = scanner.nextDouble();
		BankAccount account = findAccount(accNum);
		if(account!=null) {
			((DematAccount) account).sellStocks(stockNum,price);
		}
		else
			System.out.println("Account not found");}
	// case 5
	public static void transferMoney(Scanner scanner) {
		System.out.println("Enter senders account Number : ");
		String accNumSender=scanner.next();
		System.out.println("Enter receivers account Number : ");
		String accNumReciever=scanner.next();
		BankAccount obj1=findAccount(accNumSender);
		System.out.print("Enter the amount to be transfered");
		double amount= scanner.nextDouble();
		BankAccount obj=findAccount(accNumReciever);
		obj1.transfer(amount, obj);
	};
	
	
	public static BankAccount findAccount(String accountNumber) {
		for(int i=0;i<totalAccounts;i++) {
			if(accounts[i].getAccountNumber().equals(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
	
}
