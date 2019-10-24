package file;

import java.io.File;

public class InputAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//displayall("C:\\Users\\黄乐\\Desktop\\IO");
			deleteall("C:\\Users\\黄乐\\Desktop\\demo");
	}
	
	public static void displayall(String path) {
	
		File filepathFile=new File(path);
		File[] filelist=filepathFile.listFiles();
		if(filelist==null) {
			return  ;
		}
		
		for(File currentFile:filelist) {
			
			if(currentFile.isDirectory()) {
				
				System.out.println("文件夹："+currentFile.getAbsolutePath());
				displayall(currentFile.getAbsolutePath());
			}else {
				System.out.println("文件："+currentFile.getAbsolutePath());
			}		
			
		}
		
	}
	
	public static void deleteall(String path) {
		
		File filepathFile=new File(path);
		File[] filelist=filepathFile.listFiles();
		if(filelist==null) {
			return  ;
		}
		
		for(File currentFile:filelist) {
			
			if(currentFile.isDirectory()) {
				
				System.out.println("文件夹："+currentFile.getAbsolutePath());
				deleteall(currentFile.getAbsolutePath());
			}
				currentFile.delete();
			
		}
		
	}
	
	

}
