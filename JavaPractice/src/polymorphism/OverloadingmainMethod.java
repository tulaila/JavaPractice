package polymorphism;

public class OverloadingmainMethod {
	
	
	public void main(int x) {                  // First Method 1
		System.out.println(x);
	}
	
	public void main(int x, int y) {           // Second Method 2
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args)     //  Main Method
	{
	  OverloadingmainMethod ovm = new OverloadingmainMethod();   // Create an Object 
	   ovm.main(10);    //1
	   ovm.main(100, 200);  //2
			  
	}

}
