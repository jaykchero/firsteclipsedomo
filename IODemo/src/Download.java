import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Download {

	public static void main(String[] args) throws Exception {
		URL uri=new URL("https://d1.music.126.net/dmusic/7ee2/2019830102012/cloudmusicsetup2.5.6.197958.exe");
		URLConnection connection=uri.openConnection();
		
		
		InputStream insInputStream=connection.getInputStream();
		FileOutputStream outputStream=new FileOutputStream(new File("C:\\Users\\ª∆¿÷\\Desktop\\demo\\cloudmusicsetup2.5.6.exe"));
		
		
		byte[] buff=new byte[1024];
		
		int value=0;
		
		
		while((value=insInputStream.read(buff))!=-1) {
			
			outputStream.write(buff,0,value);
			
			
			
			
		}
		System.out.println("œ¬‘ÿ≥…π¶£°£°£°");
		
		insInputStream.close();
		outputStream.close();
		
		
		
		

	}

}
