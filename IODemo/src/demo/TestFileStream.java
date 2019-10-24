package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

public class TestFileStream {
	
	public static void main(String[] args) {
	FileInputStream in;
	FileOutputStream out;
	int b=0;
	try {
		in = new FileInputStream("D:\\cunchu\\sroce\\Hello.java");
		 out = new FileOutputStream("D:\\cunchu\\sroce\\Out.java");
		

		 
		 byte[] bbuf =new byte[1024];
			//用于保存实际读取的字节数
			int hasRead =0;
			//使用循环来重复“取水”的过程
			/*while((hasRead=in.read(bbuf))>0) {
				//取出“竹筒”中的水滴（字节），将字节数组转换成字符串输入
				
				
				
				
				
			}*/
		 
		 
		 
         while((b = in.read(bbuf)) != -1){
             out.write(b);
             System.out.println(new String(bbuf,0,b));
				
         }
         in.close();
         out.close();
     } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }   
     System.out.print("文件已复制！");
 }

	
	
}
