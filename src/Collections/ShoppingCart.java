package Collections;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.HashSet;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
//import java.util.Vector;

public class ShoppingCart {

//	private ArrayList<Product> cart= new ArrayList<>();
//	private LinkedList<Product> cart= new LinkedList<>();
//	private Vector<Product> cart= new Vector<>();
//	private HashSet<Product> cart= new HashSet<>();
//	private TreeSet<Product> cart= new TreeSet<>(new ComparingCategoryPrice());
	private Queue<Product>cart=new PriorityQueue(new ComparingCategoryPrice());
	private Scanner scanner= new Scanner(System.in);
	
//	private TreeSet<Product> cart;
	
//	public void sortingfilters() {
//		System.out.println("Choose filter: \n 1. Category-Price\n 2. Name-Price\n 3. Category Id");
//		int c=scanner.nextInt();
//		switch(c) {
//		case 1:
//			cart=new TreeSet<>(new ComparingCategoryPrice());
//			break;
//		case 2:
//				cart=new TreeSet<>(new ComaritorNamePrice());
//			break;
//		case 3:
//			cart= new TreeSet<>(new ComparitorCategoryID());
//			break;
//		default:
//				System.out.println("Invalid option");
//			
//		}	
//	}
	
	public void addProduct() {
		System.out.println("Enter product Id:");
		int id= scanner.nextInt();
		System.out.println("Enter product name:");
		String name= scanner.next();
		System.out.println("Enter product price:");
		double price= scanner.nextDouble();
		System.out.println("Enter category:");
		String category= scanner.next();
		
		cart.add(new Product(id,name,price,category));
		System.out.println("Product "+name+" has been added to cart");
	}
	
	public void removeProduct() {
		System.out.println("Enter product Id:");
		int id= scanner.nextInt();
		
		boolean removed= cart.removeIf(product->product.prodId==id);
		if(removed==true)
		{
		System.out.println("Product has been removed: "+id);
		}
		else {
			System.out.println("Product not found: "+id);
		}
	}
	
	public void searchProduct() {
		System.out.println("Enter product name to search product: ");
		String name = scanner.next();
		for(Product product:cart) {
			if(product.prodName.equalsIgnoreCase(name)) {
				System.out.println("Product :"+name+" found.");
				return;
			}
		}
			System.out.println("Product : "+name+" not found");
	}
	
	public void checkOut() {
		double totalBill=0;
		discount();
//		for( Product product: cart) {
//			totalBill+=product.productPrice;
//		}
		while(!cart.isEmpty()) {
			Product prod=cart.poll();
			System.out.println("Price of item: "+prod.productPrice);
			totalBill+=prod.productPrice;
		}
		System.out.println("Total Price to be paid: INR "+totalBill);
		cart.clear();
		System.out.println("Checkout completed. Cart is empty.");
	}
	
	public void discount() {
		double dis=0.0;
		for(Product product:cart) {
			if(product.category.equalsIgnoreCase("electronics")) {
				dis+=product.productPrice*0.10;
				System.out.println("original price: "+product.productPrice);
				product.productPrice-=(product.productPrice*0.10);
				System.out.println("10 percent discount, final price: "+product.productPrice);
			}
			else if(product.category.equalsIgnoreCase("grocery")){
				dis+=product.productPrice*0.05;
				System.out.println("original price: "+product.productPrice);
				product.productPrice-=(product.productPrice*0.05);
				System.out.println("5 percent discount, final price: "+product.productPrice);
			}
			else if(product.category.equalsIgnoreCase("footwear")){
				dis+=product.productPrice*0.07;
				System.out.println("original price: "+product.productPrice);
				product.productPrice-=(product.productPrice*0.07);
				System.out.println("7 percent discount, final price: "+product.productPrice);
			}
			else if(product.category.equalsIgnoreCase("apparel")){
				dis+=product.productPrice*0.02;
				System.out.println("original price: "+product.productPrice);
				product.productPrice-=(product.productPrice*0.02);
				System.out.println("2 percent discount, final price: "+product.productPrice);
			}
			else {
				System.out.println("no discount on this product");
			}
		}
		System.out.println("Total discount"+dis);
	}
	
	public void display() {
		if(cart.isEmpty()) {
			System.out.println("No product in cart");
			return;
		}
		for (Product product: cart) {
//			System.out.println(product.prodName+"\n");
			System.out.println(product);
		}
	}
	
	public void menu() {
		System.out.println("Shopping System");
		while(true) {
			System.out.println("Press 1: To add product\n Press 2: Remove product\n Press 3: Search product\n Press 4: Check out\n Press 5: Display cart\nPress 6:Exit ");
			int n= scanner.nextInt();
			switch(n) {
			case 1:
				addProduct();
				break;
			case 2:
				removeProduct();
				break;
			case 3:
				searchProduct();
				break;
			case 4:
				checkOut();
				break;
			case 5:
				display();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid choice");
			}
	}
	}
	
	
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
//		cart.sortingfilters();
		cart.menu();
	}

}
