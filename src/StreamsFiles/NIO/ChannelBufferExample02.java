package StreamsFiles.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample02 {

	public static void main(String[] args) {
		
		try(RandomAccessFile file = new RandomAccessFile("//Users//nikolay//Documents//test6.txt", "rw");
				FileChannel channel = file.getChannel();){
			
			ByteBuffer buffer = ByteBuffer.allocate(5);
			int byteRead = channel.read(buffer);
			System.out.println("byteRead = " + byteRead);
			buffer.flip();
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			
			buffer.rewind();
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			
//			System.out.println("---------");
//			buffer.compact(); //копирует не прочитанные байты в начало буфера
//			System.out.println("buffer.get() = " + ((char)buffer.get()));
			
			System.out.println("---------");
			buffer.compact();
			channel.read(buffer);
			buffer.flip();
			
			while (buffer.hasRemaining()) {
				System.out.println("buffer.get() = " + ((char)buffer.get()));
			}
			System.out.println("---------");
			buffer.clear();
			channel.read(buffer);
			buffer.flip();
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			buffer.mark();
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			System.out.println("buffer.get() = " + ((char)buffer.get()));
			buffer.reset();
			while (buffer.hasRemaining()) {
				System.out.println("buffer.get() = " + ((char)buffer.get()));
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
