package StreamsFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		//File file = new File("test5.txt");
		File file = new File("//Users//nikolay//Documents//test5.txt");
		File folder = new File("//Users//nikolay//Documents//");
		
		File folder2 = new File("//Users//nikolay//Documents//Test//");
		File file2 = new File("test7.txt");
		
		System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
		System.out.println("folder.getAbsolutePath() = " + folder.getAbsolutePath());
		System.out.println("---------");
		
		System.out.println("file.isAbsolute() = " + file.isAbsolute());
		System.out.println("folder.isAbsolute() = " + folder.isAbsolute());
		System.out.println("---------");
		
		System.out.println("file.isDirectory() = " + file.isDirectory());
		System.out.println("folder.isDirectory() = " + folder.isDirectory());
		System.out.println("---------");
		
		
		System.out.println("file2.createNewFile() = " + file2.createNewFile());
		System.out.println("folder2.mkdir() = " + folder2.mkdir());
		System.out.println("---------");
		
		System.out.println("file.length() = " + file.length());
		System.out.println("file2.length() = " + file2.length());
		System.out.println("folder2.length() = " + folder2.length());
		System.out.println("---------");
		
		
		System.out.println("folder2.delete() = " + folder2.delete()); //if folder is empty!!!
		System.out.println("file2.delete() = " + file2.delete());
		System.out.println("---------");
		
		File[] files = folder.listFiles();
		System.out.println("files  = " + Arrays.deepToString(files));
		
		System.out.println("file2.isHidden() = " + file2.isHidden());
		System.out.println("file2.canRead() = " + file2.canRead());
		System.out.println("file2.canWrite() = " + file2.canWrite());
		System.out.println("file2.canExecute() = " + file2.canExecute());
		System.out.println("---------");
		
	}

}
