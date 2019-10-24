import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream insInputStream=new FileInputStream("C:\\Users\\ª∆¿÷\\Desktop\\IO\\src.txt");
		OutputStream outputStream=new FileOutputStream(new File("C:\\Users\\ª∆¿÷\\Desktop\\IO\\des.txt"));
	
		byte[] buff= new byte[1024];
		int value=0;
		
		
		while((value=insInputStream.read(buff))!=-1) {
			
			outputStream.write(buff,0,value);
			
			System.out.println("∏¥÷∆≥…π¶£°");
			
			
		}
		
	

	}

}
