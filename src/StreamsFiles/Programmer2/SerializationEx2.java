package StreamsFiles.Programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import StreamsFiles.Programmer1.Employee;

public class SerializationEx2 {

	public static void main(String[] args) {
		Employee employee;
		
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("//Users//nikolay//Documents//employee2.bin"))){
			
			
			employee = (Employee) inputStream.readObject();
			
			
			System.out.println("Best employee = " + employee);
			System.out.println("Done!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
