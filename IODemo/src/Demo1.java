import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) 
		throws IOException
	{
		//以当前路径来创建一个File对象
		File file=new File(".");
		//直接获取文件名，输出一点
		System.out.println(file.getName());
		//获取路径的父路径可能出错，结果为null
		System.out.println(file.getParent());
		
		//获取绝对路径
		System.out.println(file.getAbsolutePath());
		//获取上一级路径
		//System.out.println(file.getAbsolutePath().getParent());
		//在当前路径下创建一个临时文件
		File temFile=File.createTempFile("aaa",".txt", file);
		//System.out.println(temFile.getName());
		
		//指定当jvm退出时删除该文件
		temFile.deleteOnExit();
		File newFile=new File(System.currentTimeMillis()+".txt");
		System.out.println(""+newFile.exists());
		//以指定newFile对象来创建一个文件
		newFile.createNewFile();
		//以newFile对象来创建一个目录，因为newFile对象以及存在，所以下面发方法将返回false
		newFile.mkdir();
		//System.out.println(newFile.getName());
		
		//使用list()方法列出当前路径下的所有文件和路径
		String[] filrlist=file.list();
		System.out.println("====当前路径下的所有文件和路径如下");
		
		for (int i = 0; i < filrlist.length; i++) {
			
			System.out.println(filrlist);
		}
		
		//使用listRoots()静态方法列出所有磁盘根路径
		File[] rootFiles=file.listRoots();
		for (int i = 0; i < rootFiles.length; i++) {
			System.out.println(rootFiles);
		}
		
		
	}

}
