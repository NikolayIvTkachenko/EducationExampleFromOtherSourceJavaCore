package StreamsFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyExample {

	public static void main(String[] args)  {

		try(BufferedReader reader = new BufferedReader(new FileReader("//Users//nikolay//Documents//test2.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("//Users//nikolay//Documents//test5.txt"));){


			String line;
			while((line = reader.readLine()) != null) {
				writer.write(line);
				writer.write('\n');
			}


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		

	}

}
