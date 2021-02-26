package constuctors;

// Create a class with 3 integers
// Create a Constructor for assign the values into variables
// Then create another method 'sum' to calculate sum of 3 numbers
// Now, create object and call constructor by passing 3 integer values then call sum mehtod

public class ConstructorDemo2 {
	
	int  x,y,z;
		
	public ConstructorDemo2(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	 }
	
	 void sum() {
		 int add = x+y+z;
		 System.out.println("Sum of 3 numbers : " +add);
	}
	 
	 public static void main(String[] args) {
		ConstructorDemo2 cons3 = new ConstructorDemo2(100, 200, 300);
		cons3.sum();
	}
}
