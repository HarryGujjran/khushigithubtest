public class Book 
{ private String title;
private String author; private String isbnNumber; 
private boolean bookAvailability; // Constructor 
public Book(String title, String author, String isbnNumber, boolean bookAvailability)
{ this.title = title; 
this.author = author; 
this.isbnNumber = isbnNumber; 
this.bookAvailability = bookAvailability; } 
// Getters and Setters 
public String getTitle() 
{ return title; } 
public void setTitle(String title) 
{ this.title = title; } 
public String getAuthor() 
{ return author; }
public void setAuthor(String author) 
{ this.author = author; } 
public String getIsbnNumber() 
{ return isbnNumber; } 
public void setIsbnNumber(String isbnNumber) 
{ this.isbnNumber = isbnNumber; } public boolean isBookAvailability() 
{ return bookAvailability; } 
public void setBookAvailability(boolean bookAvailability) 
{ this.bookAvailability = bookAvailability; } 
// Display Book Details 
public void update(String newTitle, String newAuthor) {
	this.title=newTitle;
	this.author=newAuthor;
	System.out.println("Update Successful");
}
public void displayBookDetails() 
{ System.out.println("Title: " + title); 
System.out.println("Author: " + author); 
System.out.println("ISBN: " + isbnNumber); 
System.out.println("Available: " + (bookAvailability ? "Yes" : "No")); 
} 
}
}