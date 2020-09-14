package StreamsFiles.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

	public static void main(String[] args) {
		
		Car car = new Car("VAZ", "Black");
		Employee employee = new Employee("Varia", 
				"Ivanova", 
				"IT", 
				//28,
				500, 
				car);
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("//Users//nikolay//Documents//employee2.bin"))){
			
			outputStream.writeObject(employee);
			
			
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
