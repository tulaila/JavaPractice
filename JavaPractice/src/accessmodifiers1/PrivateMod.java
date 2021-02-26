package accessmodifiers1;

class A {
	/*
	 * private int a = 100; // Private Variables can be accessed only within the
	 * class
	 * 
	 * private void m1() // Private Methods can be accessed only within the class {
	 * System.out.println(a); }
	 */

	int a = 100; // Defalut Accesss Modifier

	void m2() {
		System.out.println(a);
	}

}

public class PrivateMod {

	public static void main(String[] args) {
		A obj = new A();
		// obj.a=200; // Private Variables can be accessed only within the class
		// obj.m1(); // Private Methods can be accessed only within the class
	}

}
