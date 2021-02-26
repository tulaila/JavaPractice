
package Interfaces;

interface A // Interface which contains only Abstract methods
{
	int a = 100; // In Interface by default variables are Static and Final

	void m1(); // Abstract Method ( definition only method and NO Logic) , By default it is
				// Public
}

public class InterfaceAbstract implements A // Keyword 'Implements'

{
	public void m1() // Higher access modifier
	{
		System.out.println(a);
	}

	
	public static void main(String[] args) {

		// A obj=new Test();  //same as below ..

		InterfaceAbstract obj = new InterfaceAbstract(); // Creates memory location for object reference
		obj.m1();
	}

}
