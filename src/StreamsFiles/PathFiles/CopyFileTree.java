package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileTree {

	public static void main(String[] args) {
		Path source = Paths.get("//Users//nikolay//Documents//M");
		Path distination = Paths.get("//Users//nikolay//Documents//CopyM");
		try {
			Files.walkFileTree(source, new TestFileVisitor2(source, distination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
