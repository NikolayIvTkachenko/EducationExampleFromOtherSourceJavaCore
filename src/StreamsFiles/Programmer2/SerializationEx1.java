package StreamsFiles.Programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

	
public static void main(String[] args) {
		
		List<String> employees; // = new ArrayList<>();


		
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("//Users//nikolay//Documents//employees1.bin"))){
			
			
			employees = (ArrayList)inputStream.readObject();
			
			
			System.out.println("employees = " + employees);
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
