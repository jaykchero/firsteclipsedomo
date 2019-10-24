package dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		//pforEachs();
		itertorpy();
		

	}
	
	
	
	
	public static void itertorpy() {
		
		
		Collection<String> bookCollection=new HashSet<String>();
			
			bookCollection.add("java");
			bookCollection.add("C");
			bookCollection.add("python");
			
			Iterator it=bookCollection.iterator();
			while(it.hasNext()) {
				String bookString=(String) it.next();
				System.out.println(bookString);
				
				
			}
		
		
	}
	
	
	public static void pforEachs() {
		
	Collection<String> bookCollection=new HashSet<String>();
		
		bookCollection.add("java");
		bookCollection.add("C");
		bookCollection.add("python");
		//bookCollection.forEach(ojb -> System.out.println("迭代的集合元素："+ojb)); 
		bookCollection.forEach(ojb -> System.out.println("迭代的集合元素："+ojb)); 
		
		
		
	}

}
