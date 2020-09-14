package StreamsFiles.PathFiles;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class TestFileVisitor2 extends SimpleFileVisitor<Path>{

	Path source;
	Path distination;
	
	public TestFileVisitor2(Path source, Path distination) {
		this.source = source;
		this.distination = distination;
	}
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		
		System.out.println("Enter to Directory: " + dir);
		Path newDestination = distination.resolve(source.relativize(dir));
		Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("File name: " + file.getFileName());
		Path newDestination = distination.resolve(source.relativize(file));
		Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
		return FileVisitResult.CONTINUE;
	}



}
