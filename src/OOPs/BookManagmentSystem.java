public class BookManagementSystem { 
	public static void main(String[] args) { 
	// Creating Book Objects 
	Book book1 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415", true);
	Book book2 = new Book("Atomic Habits", "James Clear", "978-0735211292", false); 
	// Displaying Book Details 
	System.out.println("Book 1 Details:"); 
	book1.displayBookDetails(); System.out.println("\nBook 2 Details:"); 
	book2.displayBookDetails(); 
	// Changing Availability of a Book 
	book2.setBookAvailability(true); System.out.println("\nAfter Updating Availability:"); 
	book2.displayBookDetails(); 
	} 
}
