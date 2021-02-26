package polymorphism;

public class StaticExamle {

	static int a = 100; // Static variable
	int b = 200; // Non-static variable

	static void m1() // Static method
	{
		System.out.println("This is M1-Static  method");
	}

	void m2() // Non-Static Method
	{
		System.out.println("This is M2- Non=static method");
	}
	
	void m3()      // Non-Static Method
	{
		System.out.println("This is M3 method Non-Staic");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) {
	   
	    // 1. Static Method can only access static stuff without creating an OBJECTS
	        System.out.println(a);
	        m1();
	       StaticExamle.m1(); // if we want to call from some other class

	       //2. Static methods can also access Non-static stuff using Objects.
	        StaticExamle se=new StaticExamle();
	        System.out.println(se.b);
	        se.m2();
	        
	        //3. Non Static donesn't have any restrictions
	        se.m3();
	        
	}

}
