import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
	//�����ֽ�������
		FileInputStream fileInputStream=new FileInputStream("D:\\\\cunchu\\\\sroce\\\\Hello.java");
		//����һ������Ϊ1024�ġ���Ͳ��
		byte[] bbuf =new byte[1024];
		//���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead =0;
		//ʹ��ѭ�����ظ���ȡˮ���Ĺ���
		while((hasRead=fileInputStream.read(bbuf))>0) {
			//ȡ������Ͳ���е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ�������
			System.out.println(new String(bbuf,0,hasRead));
			
			
			
			
			
		}
		fileInputStream.close();

	}

}
