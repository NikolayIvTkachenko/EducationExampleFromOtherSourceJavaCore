package StreamsFiles;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		
		try(java.io.RandomAccessFile file 
				= new java.io.RandomAccessFile("//Users//nikolay//Documents//test5.txt", "rw")){
			
			int a = file.read();
			System.out.println((char)a);
			
			a = file.read();
			System.out.println((char)a);
			
			String s1= file.readLine();
			System.out.println(s1);
			
			file.seek(101);
			String s2 = file.readLine();
			System.out.println(s2);
			
			long position = file.getFilePointer();
			System.out.println("position = " + position);
			
			
//			file.seek(0);
//			file.writeBytes("Privet");
			
			file.seek(file.length() - 1);
			file.writeBytes("\n\t\t\t\t\tWilliam Butkler Yeats");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
