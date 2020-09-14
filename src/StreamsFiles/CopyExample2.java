package StreamsFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExample2 {
	
	
	public static void main(String[] args)  {
		
		try (FileInputStream inputStream = new FileInputStream("//Users//nikolay//Documents//images.jpg");
				FileOutputStream outputStream = new FileOutputStream("//Users//nikolay//Documents//images2.jpg");){

			int i;
			while((i = inputStream.read()) != -1) {
				
				outputStream.write(i);
				
			}
			
			
			
			System.out.println("Done!");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
