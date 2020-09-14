package StreamsFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx2 {

public static void main(String[] args) throws IOException  {
		
		
		try (FileReader reader = new FileReader("//Users//nikolay//Documents//test2.txt");
			 FileWriter writer = new FileWriter("//Users//nikolay//Documents//test2.txt", true);	) {
			int character;
			while((character = reader.read()) != -1 ){
				System.out.print((char)character);
			}
			System.out.println();
			System.out.println("Done!");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
}
