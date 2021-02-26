package polymorphism;

public class ThisKeyword {
	
	int a,b; // Instance variables or Class variables

	void getValues(int a, int b)   // method variables or External variables
	{
		this.a=a;            // this keyword this.a  belongs to class
		this.b=b;            // this keyword this.b  belongs to class
	}

	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword();
		th.getValues(100, 200);
		th.printValues();

	}

}
