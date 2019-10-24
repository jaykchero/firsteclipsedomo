import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) 
		throws IOException
	{
		//�Ե�ǰ·��������һ��File����
		File file=new File(".");
		//ֱ�ӻ�ȡ�ļ��������һ��
		System.out.println(file.getName());
		//��ȡ·���ĸ�·�����ܳ������Ϊnull
		System.out.println(file.getParent());
		
		//��ȡ����·��
		System.out.println(file.getAbsolutePath());
		//��ȡ��һ��·��
		//System.out.println(file.getAbsolutePath().getParent());
		//�ڵ�ǰ·���´���һ����ʱ�ļ�
		File temFile=File.createTempFile("aaa",".txt", file);
		//System.out.println(temFile.getName());
		
		//ָ����jvm�˳�ʱɾ�����ļ�
		temFile.deleteOnExit();
		File newFile=new File(System.currentTimeMillis()+".txt");
		System.out.println(""+newFile.exists());
		//��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		//��newFile����������һ��Ŀ¼����ΪnewFile�����Լ����ڣ��������淢����������false
		newFile.mkdir();
		//System.out.println(newFile.getName());
		
		//ʹ��list()�����г���ǰ·���µ������ļ���·��
		String[] filrlist=file.list();
		System.out.println("====��ǰ·���µ������ļ���·������");
		
		for (int i = 0; i < filrlist.length; i++) {
			
			System.out.println(filrlist);
		}
		
		//ʹ��listRoots()��̬�����г����д��̸�·��
		File[] rootFiles=file.listRoots();
		for (int i = 0; i < rootFiles.length; i++) {
			System.out.println(rootFiles);
		}
		
		
	}

}
