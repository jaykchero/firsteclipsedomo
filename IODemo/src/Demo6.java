import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo6 {
	public static void  main(String args[])  {
		
		
		InputStream insInputStream=null;
		OutputStream outputStream=null;
		try {
			insInputStream=new FileInputStream("C:\\Users\\黄乐\\Desktop\\嵌入式\\天津城建2.pdf");
			
			
			
			outputStream=new FileOutputStream(new File("C:\\\\Users\\\\黄乐\\\\Desktop\\\\嵌入式\\\\io233.pdf"));
			
			byte[] buff =new byte[1024];
			int length=0;
			
			while((length=insInputStream.read(buff))!=-1) 
			{
				
				outputStream.write(buff,0,length);
				System.out.println("写入成功");
				
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(insInputStream!=null) {
				
				try {
					insInputStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				if (outputStream!=null) {
					try {
						outputStream.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	

}
