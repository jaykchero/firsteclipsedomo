import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter writer=new FileWriter(new File("C:\\Users\\����\\Desktop\\IO\\demo5.txt"),true);
		
		writer.write("abc999");
		writer.close();
		System.out.println("д��ɹ���");
		

	}

}
