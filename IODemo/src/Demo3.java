import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
	//创建字节输入流
		FileInputStream fileInputStream=new FileInputStream("D:\\\\cunchu\\\\sroce\\\\Hello.java");
		//创建一个长度为1024的“竹筒”
		byte[] bbuf =new byte[1024];
		//用于保存实际读取的字节数
		int hasRead =0;
		//使用循环来重复“取水”的过程
		while((hasRead=fileInputStream.read(bbuf))>0) {
			//取出“竹筒”中的水滴（字节），将字节数组转换成字符串输入
			System.out.println(new String(bbuf,0,hasRead));
			
			
			
			
			
		}
		fileInputStream.close();

	}

}
