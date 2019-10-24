import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamTurnRead {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			
		File file=new File("C:\\Users\\ª∆¿÷\\Desktop\\demo\\ww.txt");
		
		
		FileInputStream iStream=new FileInputStream(file);
		
		Reader reader=new InputStreamReader(iStream);
		
		BufferedReader bufferedReader=new BufferedReader(reader);
		
		String lineString=null;
		
		while((lineString=bufferedReader.readLine())!=null) {
			
			System.out.println(lineString);
			
		}
		
		
		
		
		
	}

}
