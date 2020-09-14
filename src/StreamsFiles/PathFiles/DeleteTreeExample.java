package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteTreeExample {

	public static void main(String[] args) {
		Path path = Paths.get("//Users//nikolay//Documents//CopyM");
		try {
			Files.walkFileTree(path, new TestFileVisitorDelete());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
