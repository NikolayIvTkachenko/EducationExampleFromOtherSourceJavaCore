package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesExample04 {

	public static void main(String[] args) {
		
		
		Path filePath = Paths.get("//Users//nikolay//Documents");
		try {
			Files.walkFileTree(filePath, new TestFileVisitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
