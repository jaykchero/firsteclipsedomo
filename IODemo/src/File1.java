import java.io.File;

public class File1 {

	public static void main(String[] args) {
		File file=new File("C:"+File.separator+"Users\\»ÆÀÖ\\Desktop\\Ñ¹Ëõ°ü");
		File[] files=file.listFiles();
		
		for(File f:files) {
			System.out.println(f.getName());
			
			
		}

	}

}
