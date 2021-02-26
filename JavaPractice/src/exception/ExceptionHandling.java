package exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Program In Progress");

	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = input.nextInt();
		int a = 100;

		try
		{
			System.out.println(a / num);  //Arithmetic Exception:  
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Exception occured..but handled by try catch block"); // handle exception
		} */


		 String s ="welcome";   	//NumberFormatException
	    // String s ="12345";
	     int n=0;
	     
	     try {
	    	 n=Integer.parseInt(s);    //Convert String to Int
	     } catch (NumberFormatException e) {
			System.out.println("Exception occured..but handled by try catch block"); // handle exception
	     }
	    
		 
		System.out.println(n+100); // o/p 12445 */

		/*String s=null;                   // NullPointerException
		System.out.println(s.length());  

		/*int a[]=new int[5];    
		a[10]=100;  //ArrayIndexOutOfBoundsException */


		System.out.println("Program Completed");
		System.out.println("Program Exited"); 

	}

}
