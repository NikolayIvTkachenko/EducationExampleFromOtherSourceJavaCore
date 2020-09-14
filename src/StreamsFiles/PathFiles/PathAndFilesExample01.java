package StreamsFiles.PathFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesExample01 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("//Users//nikolay//Documents//test5.txt");
		Path directoryPath = Paths.get("//Users//nikolay//Documents//");
		
		System.out.println("filePath.getFileName : " + filePath.getFileName());
		System.out.println("directoryPath.getFileName : " + directoryPath.getFileName());
		
		System.out.println("filePath.getParent : " + filePath.getParent());
		System.out.println("directoryPath.getParent : " + directoryPath.getParent());
		
		
		System.out.println("filePath.getRoot : " + filePath.getRoot());
		System.out.println("directoryPath.getRoot : " + directoryPath.getRoot());
		
		System.out.println("filePath.isAbsolute : " + filePath.isAbsolute());
		System.out.println("directoryPath.isAbsolute : " + directoryPath.isAbsolute());
		
		System.out.println("filePath.toAbsolutePath : " + filePath.toAbsolutePath());
		System.out.println("directoryPath.toAbsolutePath : " + directoryPath.toAbsolutePath());
		
		System.out.println("filePath.toAbsolutePath.getParent() : " + filePath.toAbsolutePath().getParent());
		System.out.println("directoryPath.toAbsolutePath.getParent() : " + directoryPath.toAbsolutePath().getParent());
		
		System.out.println("directoryPath.resolve(filePath) : " + directoryPath.resolve(filePath));
		
		System.out.println("directoryPath.relativize(filePath) : " + directoryPath.relativize(filePath));
		
		if (!Files.exists(filePath)) {
			try {
				Files.createFile(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (!Files.exists(directoryPath)) {
			try {
				Files.createDirectory(directoryPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println("Files.isReadable(filePath) : " + Files.isReadable(filePath));
		System.out.println("Files.isWritable(filePath) : " + Files.isWritable(filePath));
		System.out.println("Files.isExecutable(filePath) : " + Files.isExecutable(filePath));
		
		Path filePath2 = Paths.get("//Users//nikolay//Documents//test.txt");
		try {
			System.out.println("Files.isSameFile(filePath, filePath2) : " + Files.isSameFile(filePath, filePath2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("Files.size(filePath) : " + Files.size(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Files.getAttribute(filePath, \"creationTime\") : " + Files.getAttribute(filePath, "creationTime"));
			System.out.println("Files.getAttribute(filePath, \"size\") : " + Files.getAttribute(filePath, "size"));
			System.out.println("----");
			System.out.println("Files.getAttributes(filePath, \"*\") : " + Files.readAttributes(filePath, "*"));
			
			Map<String, Object> attributes =  Files.readAttributes(filePath, "*");
			
			for(Map.Entry<String, Object> item : attributes.entrySet() ) {
				
				System.out.println(item.getKey() + "  :  " + item.getValue());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done!");

	}

}
