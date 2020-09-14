package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesExample02 {

	public static void main(String[] args)  {
		
		Path filePath = Paths.get("//Users//nikolay//Documents//test5.txt");
		Path directoryPath = Paths.get("//Users//nikolay//Documents//M");
		Path directoryPathB = Paths.get("//Users//nikolay//Documents//B");
		
		try {
			Files.copy(filePath, directoryPath.resolve(filePath.getFileName()), StandardCopyOption.REPLACE_EXISTING);
			Files.copy(filePath, directoryPath.resolve("test14.txt"), StandardCopyOption.REPLACE_EXISTING);
			
			//Files.copy(directoryPath, directoryPath.resolve("BB"));
			
			Files.move(filePath, directoryPath.resolve("test20.txt"), StandardCopyOption.REPLACE_EXISTING);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e = "+e);
		}

		
		System.out.println("Done!");
		
		
		
		
	}

}
