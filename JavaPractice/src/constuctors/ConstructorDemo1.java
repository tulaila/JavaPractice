package constuctors;

public class ConstructorDemo1 {

	int x;
	int y;

	public ConstructorDemo1() { // Default constructor
		x = 100;
		y = 200;
	}

	public ConstructorDemo1(int a, int b) { // Parameterized constructor
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		ConstructorDemo1 cons1 = new ConstructorDemo1(); // Invokes default Constructor
		cons1.display();

		ConstructorDemo1 cons2 = new ConstructorDemo1(300, 400); // Invokes Parameterized Constructor
		cons2.display();
	}
}
