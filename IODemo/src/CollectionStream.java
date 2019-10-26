import java.util.Collection;
import java.util.HashSet;
//899998黄乐
public class CollectionStream {
		
	public static void main(String[] args) {

		//2019/10/26
		
		
		Collection<String> bookStrings=new HashSet<String>();
		bookStrings.add("java");
		bookStrings.add("c");
		bookStrings.add("python");
		bookStrings.add("c++");
		bookStrings.add("android");
		
		System.out.println(bookStrings.stream().filter(ele-> ((String)ele).contains("a")).count());
		
		System.out.println(bookStrings.stream().filter(ele->((String)ele).length()>3).count());
		System.out.println(bookStrings.stream().filter(ele->((String)ele).length()>5).findFirst());
		bookStrings.stream().mapToInt(ele->((String)ele).length()).forEach(System.out::println);
		//閬嶅巻Instream涓殑鎵�鏈夊厓绱�
		bookStrings.stream().forEach(System.out::println);
		
	}

}
