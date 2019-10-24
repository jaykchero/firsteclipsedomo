package demo;

import org.omg.PortableInterceptor.INACTIVE;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]=new int[20];
			
			for(int i=0;i<a.length;i++) {
				
				a[i]=(int) (Math.random()*100);
				
				
			}
			
			for (int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
	}

}
