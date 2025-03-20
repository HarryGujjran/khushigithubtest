package multiThreading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
public class SerializationApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Prathak",123);
		try {
			FileOutputStream fo = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream (fo);
			out.writeObject(p);
			fo.close();
			out.close();
			System.out.println("Object is Serialized..");
		}catch(IOException e)
		{
			System.out.println("Exception Caught: "+e.getMessage());
		}
 
	}
 
}