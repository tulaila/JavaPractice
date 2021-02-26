package Inheritance;

	class Bank   //Parent Class
	 {
	  double rateOfIntrest()
	  {
	    return 0;
	  }
	 }
	
	class TD extends Bank
	 {
	  double rateOfIntrest()   
	  {
	    return 4.5;  //Change only body from Bank
	  }
	 }
	
	class BMO extends Bank
	 {
	  double rateOfIntrest()
	  {
	    return 5.1;   //Change only body from Bank
	  }
	 }
	

public class MethodOverriding {

	public static void main(String[] args) {
		
		 TD tdobj=new TD();
		System.out.println(tdobj.rateOfIntrest());
		
		 BMO bdobj=new BMO();
		System.out.println(bdobj.rateOfIntrest());
	}

}
