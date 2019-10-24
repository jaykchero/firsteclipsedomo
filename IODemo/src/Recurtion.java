import java.util.concurrent.CountDownLatch;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Recurtion {

	public static void main(String[] args) {
		
		
		
		//sum(2);
		//System.out.println(sum(5));
		//zero();
		System.out.println("result="+sum2(5));
	}

	
	
	
	public static int sum2(int number) {
		
		
		if(number==0) {
			
			return 0;
		}
		
		
		
		
		return  (number-1) +sum2(--number);
		
		
		// (number-1) +sum2(--number) --> 4+{number=3}	4+( 2+(1+0))
		// (number-1) +sum2(--number) --> 3+{number=2} 3+( 2+(1+0))
		// (number-1) +sum2(--number) --> 2+{number=1} 2+(1+0)
		// (number-1) +sum2(--number) --> 1+{number=0} 1+0
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	 static int count= 0;
	public static int sum(int number) {
		
		
		if(number!=0) {

			
		
			
			//System.out.println(number);
			sum(--number);
		
			
			System.out.println(number);
			count+=number;
		}
		
		return count;
			
		
	}
	
	public static void zero() {
		
		
		int a=0;
		
		System.out.println(--a);
		
		
		
		
	
		
	}
	
	
}
