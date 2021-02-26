package variables;


public class MyPractice {

	public static void main(String[] args) {

		//------postive or negative number-----------------
		//		int num=12;
		//		if(num>0) {
		//			System.out.println("Number is Positive");
		//		}
		//		else {
		//			System.out.println("Number is Negative");
		//		}
		//-------------greatest number ------------------------
		//		         int a =53, b=82, c=93;
		//		         if(a>b && a>c) {
		//		        	 System.out.println(a+ " Greatest number");
		//		         }
		//		         else if (b>c && b>a) {
		//		        	 System.out.println(b+ " Greatest number");
		//				}
		//		         else {
		//		        	 System.out.println(c+ " Greatest number");
		//		         }

		//-------------Mulitiplication ------------------------
		//		int num=47;
		//		for(int i=0; i<=10; i++)
		//		{
		//			int res = num*i;
		//			System.out.println(num+"X"+i+"="+res);
		//
		//		}
		//-------------Number of digits ------------------------		
		//		int count = 0;
		//		int num = 5261;
		//		while(num != 0)
		//		{
		//			num /= 10;  // 345  34  3
		//			++count;
		//		}
		//		System.out.println("Number of digits: " + count);
		//-------------factorials ------------------------	
		//          int num=10;
		//          int fact=1;
		//          while(num !=0)
		//          {
		//        	  fact = fact*num;
		//        	  --num;
		//	     	}
		//          System.out.println("factorial: " + fact);
		//-------------factorials : for loop ------------------------	

//		int num=10;
//		long fact =1;
//		for (int i=1; i<=num; i++) {
//			fact*=i;
//			System.out.println(fact);	
//		}
//		System.out.println("factorial: " + fact);	
//		
		
	//-------------------Fibonacci  Numbers	------
		 long i= 0;
		 long j= 1;
		 System.out.println(i);
		 System.out.println(j);
		 
		 for (int fib=0; fib<=100; fib++)
		 {
			long k=i+j;
			 System.out.println(k);
			 i=j;
			 j=k;
			 		 
		 }
	}

}
