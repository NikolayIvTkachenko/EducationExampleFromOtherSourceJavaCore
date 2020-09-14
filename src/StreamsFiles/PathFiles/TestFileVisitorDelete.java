package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TestFileVisitorDelete extends SimpleFileVisitor<Path> {



	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Delete file name: " + file.getFileName());
		Files.delete(file);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Delete Directory: " + dir.getFileName());
		Files.delete(dir);
		return FileVisitResult.CONTINUE;
	}

}
