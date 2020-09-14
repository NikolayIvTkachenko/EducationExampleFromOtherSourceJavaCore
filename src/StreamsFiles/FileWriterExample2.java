package StreamsFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {

	public static void main(String[] args) throws IOException {
		String rubai = "Ты ночь моей надежды сделай днём,\n" + 
				"Пусть рок мой ходит с поднятым челом,\n" + 
				"Пусть, как Лейли, мой стих блеснёт лучом,\n" + 
				"И, как Меджнун, он сердце жжёт огнём \n";
		
		String str1 = "Hello";
		
		
		try(FileWriter writer = new FileWriter("//Users//nikolay//Documents//test.txt", true)) {
			
			for(int i = 0; i < rubai.length(); i++) {
				writer.write(rubai.charAt(i));
			}
			writer.write(rubai);
			
			writer.append(str1);
			
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
