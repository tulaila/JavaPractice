package Inheritance;

public class FinalKeyword {
	
//	  final int speed = 100; // Final Variable
//
//	public static void main(String[] args) {
//		
//		FinalKeyword fv=new FinalKeyword();
//		//fv.speed=200;  // 1. incorrect, cannot change for Final Keyword variables
//		
//		System.out.println(fv.speed);
//				
				
	final class Bike   //Parent Final Class
	{
		final void run() {              //Final Method
			System.out.println("Parent Run Method");
		}
		
	}
   
	// class Honda extends Bike    // 2.  Cannot Extend to Child class because it was Final in Parent Class
	{
	//	void run() {  // 3. Cannot override for Final parent Method in child Classes
	//		System.out.println("Child Run Method");   
		}
		
	}
 
