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
			//���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead =0;
			//ʹ��ѭ�����ظ���ȡˮ���Ĺ���
			/*while((hasRead=in.read(bbuf))>0) {
				//ȡ������Ͳ���е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ�������
				
				
				
				
				
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
     System.out.print("�ļ��Ѹ��ƣ�");
 }

	
	
}
