import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//����Instream�е�����Ԫ��
		bookStrings.stream().forEach(System.out::println);
		
	}

}