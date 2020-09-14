package StreamsFiles;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatStreamEx {

	public static void main(String[] args) {
		
		try (DataOutputStream outpuStream = new DataOutputStream(new FileOutputStream("//Users//nikolay//Documents//test66.bin"));
				DataInputStream inputStrteam = new DataInputStream(new FileInputStream("//Users//nikolay//Documents//test66.bin"));){
			
			outpuStream.writeBoolean(true);
			outpuStream.writeByte(5);
			outpuStream.writeShort(5);
			outpuStream.writeInt(5000);
			outpuStream.writeLong(5_000_000L);
			outpuStream.writeFloat(3.14f);
			outpuStream.writeDouble(123.456);
			
			System.out.println(inputStrteam.readBoolean());
			System.out.println(inputStrteam.readByte());
			System.out.println(inputStrteam.readShort());
			System.out.println(inputStrteam.readInt());
			System.out.println(inputStrteam.readLong());
			System.out.println(inputStrteam.readFloat());
			System.out.println(inputStrteam.readDouble());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
