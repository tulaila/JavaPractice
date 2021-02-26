package Interfaces;

class A1 {              // Parent Class
	void m1() {
		System.out.println("This is m1 from A1 ");
	}
}

interface B1 {         //Parent Interface and Child to A1
	void m2();
}

interface B2 {           //Parent Interface and Child to A1
	void m3();
}


public class HybridInheritance extends A1 implements B1, B2 {      // Child Class for B1 & B2 also Grand child for class A1
	public void m2() {
		System.out.println("This is m2 from B1");
	}

	public void m3() {
		System.out.println("This is m3 from B2");
	}

	public static void main(String[] args) {
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();

	}

}
