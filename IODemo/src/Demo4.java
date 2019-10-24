import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		InputStream insInputStream=null;
		insInputStream= new FileInputStream("D:\\BaiduYunDownload\\8.异常通知、环绕通知.mp4");
		int value=0;
		int length=0;
		
		byte[] bs=new byte[1024];
		while((length=insInputStream.read(bs))!=-1) {
			
			System.out.println(length);
			
			
			
		}
		
		
		
	}

	
}
