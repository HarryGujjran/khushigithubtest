package multiThreading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
 
public class DeserializationApp {
 
	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("person.ser");
			ObjectInputStream in=new ObjectInputStream(file);
			Person person=(Person) in.readObject();
			in.close();
			file.close();
			System.out.println("Deserialized: "+person);
		}
		catch(IOException|ClassNotFoundException e) {
			System.out.println("exception caught: "+e.getMessage());
		}
 
	}
 
}
