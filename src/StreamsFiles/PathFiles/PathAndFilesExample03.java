package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PathAndFilesExample03 {

	public static void main(String[] args) throws IOException {
		
		Path filePath = Paths.get("test101.txt");
		Files.createFile(filePath);
		
		String dialog = "Privet\n Privet\n 12\n \n 334";
		Files.write(filePath, dialog.getBytes()); //, StandardCopyOption.REPLACE_EXISTING);
		
		List<String> list = Files.readAllLines(filePath);
		
		for(String s : list) {
			System.out.println(s);
		}
		

		
		

	}

}
