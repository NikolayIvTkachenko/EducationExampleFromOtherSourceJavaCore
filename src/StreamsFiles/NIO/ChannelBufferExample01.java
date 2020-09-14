package StreamsFiles.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample01 {

	public static void main(String[] args) {
		
		try(RandomAccessFile file = new RandomAccessFile("//Users//nikolay//Documents//test5.txt", "rw");
				FileChannel channel = file.getChannel();){
			
			ByteBuffer buffer = ByteBuffer.allocate(25);
			StringBuilder stix = new StringBuilder();
			
			int byteRead = channel.read(buffer);
			while(byteRead > 0) {
				System.out.println("Read: "+ byteRead);
				
				
				buffer.flip();
				while(buffer.hasRemaining()) {
					stix.append((char)buffer.get());
				}
				
				buffer.clear();
				byteRead = channel.read(buffer);
			}
			
			System.out.println(stix);
			
			String text = "\n Albert Einstein, (born March 14, 1879, Ulm, Württemberg, "
					+ "Germany—died April 18, 1955, Princeton, New Jersey, U.S.), "
					+ "German-born physicist who developed the special and general "
					+ "theories of relativity and won the Nobel Prize for Physics "
					+ "in 1921 for his explanation of the photoelectric effect. "
					+ "Einstein is generally considered the most influential "
					+ "physicist of the 20th century.";
			
			//Version1
//			ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//			buffer2.put(text.getBytes());
//			
//			buffer2.flip();
//			channel.write(buffer2);
			
			//Version 2
			ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
			channel.write(buffer2);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
