package polymorphism;

public class MethodOverloading {
	
	// Number of Parameters
	// Data Type of Parameters

	void add(int a, int b)   //1
	{
		System.out.println(a+b);
	}

	void add(int a, double b)   //2
	{
		System.out.println(a+b);
	}

	void add(double a, double b) //3
	{
		System.out.println(a+b);
	}

	void add(int a, int b, int c) //3
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();

		mo.add(10,20);   			// Calling 1
		mo.add(100, 200, 300);		// Calling 4
		mo.add(50, 60.5);			// Calling 3
		mo.add(80.5, 90.5);			// Calling 2

	}
}
