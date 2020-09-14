package StreamsFiles.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

	public static void main(String[] args) {
		
		List<String> employees = new ArrayList<>();
		
		employees.add("Nick");
		employees.add("Oleg");
		employees.add("Ivan");
		employees.add("Elena");
		
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("//Users//nikolay//Documents//employees1.bin"))){
			
			
			outputStream.writeObject(employees);
			
			System.out.println("Done!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
