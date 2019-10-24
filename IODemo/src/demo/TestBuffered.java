package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			  BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\cunchu\\\\sroce\\\\Hello.java"));
	          BufferedReader br = new BufferedReader(new FileReader("D:\\\\cunchu\\\\sroce\\\\out.java"));
	          String s = null;
	            //向文件中写了100行0~1的随机数
	            for(int i = 0;i<100;i++){
	                s = String.valueOf(Math.random());
	                bw.write(s);
	                bw.newLine();
	                
	            }
	                bw.flush();
	                //打印数据
	                while((s=br.readLine()) != null){
	                    System.out.println(s);
	                }
	                //关闭流
	                bw.close();
	                br.close();
	  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
