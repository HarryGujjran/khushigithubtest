package JavaBasics;
//package javaBasics;
//
//import java.io.*;
//
//public class c1 {
//	public static void checkAge(int age) {
//		if(age<18) {
//			throw new ArithmeticException("Not eligible to open bank account. ");
//		}
//		System.out.println("Eligible to open BAnk Account");
//	}
//	static void readFile() throws IOException{
//		FileReader file = new FileReader("xyz.txt");
//	}
//	public static void main(String[] args) {
//		
//		try {
//			checkAge(12);
//			readFile();
//		}
//		catch (IOException e) {
//			System.out.println("Exception handled : "+e.getMessage());
//		}
//		catch (ArithmeticException e ) {
//			System.out.println("Exception handled : "+e.getMessage());
//		}
//	}
//
//}
 
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
 
class InsufficientFundsException extends RuntimeException{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
 
 
class UseCustomException{
	static void validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be gretaer than 18 to open the account. ");
		}
		else {
			System.out.println("Valid age. Account can be opened. ");
		}
	}
	static void withdraw(int a, int b) throws InsufficientFundsException{
		if(b>a)
			throw new InsufficientFundsException("Insufficient Balance ");
		else
			System.out.println("Remaining Balance: "+ (a-b));
	}
	public static void main(String[] args) {
		  try {
			  validateAge(18);
			  withdraw(1000,2000);
		  }
		  catch(InvalidAgeException e) {
			  System.out.println("Exception caught : "+e.getMessage());
		  }
		  catch(InsufficientFundsException e) {
			  System.out.println("Exception caught : "+e.getMessage());
		  }  
	  }
}
 